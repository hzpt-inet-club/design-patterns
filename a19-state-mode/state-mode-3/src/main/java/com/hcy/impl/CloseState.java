package com.hcy.impl;


import com.hcy.ActivityService;
import com.hcy.Result;
import com.hcy.State;
import com.hcy.Status;

/**
 * 活动状态；活动关闭
 */
public class CloseState extends State {

    @Override
    public Result arraignment(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "活动关闭不可提审");
    }

    @Override
    public Result checkPass(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "活动关闭不可审核通过");
    }

    @Override
    public Result checkRefuse(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "活动关闭不可审核拒绝");
    }

    @Override
    public Result checkRevoke(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "活动关闭不可撤销审核");
    }

    @Override
    public Result close(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "活动关闭不可重复关闭");
    }

    @Override
    public Result open(String activityId, Enum<Status> currentStatus) {
        ActivityService.execStatus(activityId, currentStatus, Status.Open);
        return new Result("0000", "活动开启完成");
    }

    @Override
    public Result doing(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "活动关闭不可变更活动中");
    }

}
