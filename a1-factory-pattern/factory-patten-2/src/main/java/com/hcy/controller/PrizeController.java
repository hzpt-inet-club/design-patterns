package com.hcy.controller;

import com.alibaba.fastjson.JSON;
import com.hcy.code.entity.CouponResult;
import com.hcy.code.entity.DeliverReq;
import com.hcy.code.service.CouponService;
import com.hcy.code.service.GoodsService;
import com.hcy.code.service.IQiYiCardService;
import com.hcy.entity.AwardReq;
import com.hcy.entity.AwardRes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 进行奖品发送
 * @author HCY
 * @since 2021/3/12 下午5:25
*/
public class PrizeController {

    /**
     * 添加日志
     */
    private Logger logger = LoggerFactory.getLogger(PrizeController.class);

    public AwardRes awardToUser(AwardReq req){
        String reqJson = JSON.toJSONString(req);
        AwardRes awardRes = null;
        try {
            logger.info("奖品发放开始{}.req:{}",req.getUId(),reqJson);
            //按照不同类型方法商品[1优惠券、2实物商品、3第三方兑换卡(爱奇艺)]
            if (req.getAwardType() == 1){
                CouponService couponService = new CouponService();
                CouponResult couponResult = couponService.sendCoupon(
                          req.getUId()
                        , req.getAwardNumber()
                        , req.getBizId());
                if ("0000".equals(couponResult.getCode())){
                    awardRes = new AwardRes("0000","发送成功");
                }else {
                    awardRes = new AwardRes("0001",couponResult.getInfo());
                }
            }else if (req.getAwardType() == 2){
                GoodsService goodsService = new GoodsService();
                DeliverReq deliverReq = new DeliverReq();
                deliverReq.setUserName(queryUserName(req.getUId()));
                deliverReq.setUserPhone(queryUserPhoneNumber(req.getUId()));
                deliverReq.setSku(req.getAwardNumber());
                deliverReq.setOrderId(req.getBizId());
                deliverReq.setConsigneeUserName(req.getExtMap().get("consigneeUserName"));
                deliverReq.setUserPhone(req.getExtMap().get("consigneeUserPhone"));
                deliverReq.setConsigneeUserAddress(req.getExtMap().get("consigneeUserAddress"));
                if (goodsService.deliverGoods(deliverReq)){
                    awardRes = new AwardRes("0000","发送成功");
                }else {
                    awardRes = new AwardRes("0001","发送失败");
                }
            }else if (req.getAwardType() == 3){
                String bindMobileNumber = queryUserPhoneNumber(req.getUId());
                IQiYiCardService iQiYiCardService = new IQiYiCardService();
                iQiYiCardService.grantToken(bindMobileNumber,req.getAwardNumber());
                awardRes = new AwardRes("0000","发送成功");
            }
            logger.info("奖品发放完成",req.getUId());
        } catch (Exception e) {
            logger.error("奖品发放失败{}。req:{}",req.getUId(),reqJson);
            awardRes = new AwardRes("0001",e.getMessage());
        }
        return awardRes;
    }

    private String queryUserName(String uId){
        return "晓寻遥";
    }

    private String queryUserPhoneNumber(String uId){
        return "12345678901";
    }

}
