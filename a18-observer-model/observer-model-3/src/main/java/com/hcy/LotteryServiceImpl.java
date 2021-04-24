package com.hcy;

import java.util.Date;

/**
 * 业务接口实现类
 * @author HCY
 * @since 2021/4/24 2:26 下午
*/
public class LotteryServiceImpl extends LotteryService {

    private MinibusTargetService minibusTargetService = new MinibusTargetService();

    @Override
    protected LotteryResult doDraw(String uId) {
        // 摇号
        String lottery = minibusTargetService.lottery(uId);
        // 结果
        return new LotteryResult(uId, lottery, new Date());
    }

}
