package com.hcy;

/**
 * 活动枚举状态
 * @author HCY
 * @since 2021/4/24 8:00 下午
*/
public enum Status {

    // 1创建编辑、2待审核、3审核通过(任务扫描成活动中)、4审核拒绝(可以撤审到编辑状态)、5活动中、6活动关闭、7活动开启(任务扫描成活动中)
    Editing, Check, Pass, Refuse, Doing, Close, Open

}
