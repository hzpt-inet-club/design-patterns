package com.hcy.group;


/**
 * 雇员
 * @author HCY
 * @since 2021/4/22 7:41 下午
*/
public class Employee {

    /**
     * ID
     */
    private String uId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 备注
     */
    private String desc;
    public Employee(String uId, String name) {
        this.uId = uId;
        this.name = name;
    }

    public Employee(String uId, String name, String desc) {
        this.uId = uId;
        this.name = name;
        this.desc = desc;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
