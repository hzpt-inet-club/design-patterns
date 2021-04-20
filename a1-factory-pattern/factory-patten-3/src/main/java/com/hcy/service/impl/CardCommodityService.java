package com.hcy.service.impl;

import com.alibaba.fastjson.JSON;
import com.hcy.code.service.IQiYiCardService;
import com.hcy.service.ICommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * 第三⽅方兑换卡
 * @author HCY
 * @since 2021/3/12 下午11:49
*/
public class CardCommodityService implements ICommodity {

    private Logger logger = LoggerFactory.getLogger(CardCommodityService.class);
    /**
     * 模拟注⼊
     */
    private IQiYiCardService iQiYiCardService = new IQiYiCardService();


    /**
     * 奖品发放接口
     * @author HCY
     * @since 2021/3/12 下午11:50
     * @param uId: 用户序号
     * @param commodityId:奖品ID
     * @param bizId:业务ID
     * @param extMap:扩展字段
     * @throws Exception:异常
     * @return void
     */
    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        String mobile = queryUserMobile(uId);
        iQiYiCardService.grantToken(mobile, bizId);
        logger.info("请求参数[爱奇艺兑换卡] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[爱奇艺兑换卡]：success");
    }

    private String queryUserMobile(String uId) {
        return "15200101232";
    }
}
