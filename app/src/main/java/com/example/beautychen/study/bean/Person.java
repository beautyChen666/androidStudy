package com.example.beautychen.study.bean;

import android.util.Log;

/**
 * Created by beautyChen on 2017/8/21.
 */

public class Person{

    private static final String TAG = "Person";
    private String name;
    private static String sex="男";

    public static void main(String[] args) {
       Person p=new Person();
//        Log.v(TAG,p.name);
    }
    static {
        sex="女";
    }
    public Person() {
        this("123");
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speak(String words){
        Log.d(TAG,words);
    }

    public static void  speak(){
        Log.d(TAG,TAG);
    }
}
