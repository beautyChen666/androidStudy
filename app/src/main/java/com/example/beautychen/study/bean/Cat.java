package com.example.beautychen.study.bean;

/**
 * Created by beautyChen on 2017/8/21.
 */

public class Cat {
    public static String color;
    protected String sex;
    static{
        color="白色的";
    }
    private boolean canGetFesh;

    public Cat(String color) {
        this.color = color;
    }

    public Cat(boolean canGetFesh) {
        this.canGetFesh = canGetFesh;
    }

    public String toGetFesh(){
        return this.canGetFesh?"抓得来":"不得行";
    }

}
