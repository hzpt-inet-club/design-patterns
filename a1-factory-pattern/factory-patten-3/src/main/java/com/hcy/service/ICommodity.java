package com.hcy.service;

import java.util.Map;

/**
 * 奖品发放
 * @author HCY
 * @since 2021/3/12 下午11:48
*/
public interface ICommodity {
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
    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;
}

