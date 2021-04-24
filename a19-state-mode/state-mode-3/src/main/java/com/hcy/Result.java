package com.hcy;

public class Result {

    /**
     * 编码
     */
    private String code;
    /**
     * 描述
     */
    private String info;

    public Result(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
