package com.hcy;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * 活动信息
 * @author HCY
 * @since 2021/4/7 下午4:29
*/
@Getter
@Setter
@ToString
public class Activity {

    /**
     * 活动ID
     */
    private Long id;
    /**
     * 活动名称
     */
    private String name;
    /**
     * 活动描述
     */
    private String desc;
    /**
     * 开始时间
     */
    private Date startTime;
    /**
     * 结束时间
     */
    private Date stopTime;
    /**
     * 活动库存
     */
    private Stock stock;

}
