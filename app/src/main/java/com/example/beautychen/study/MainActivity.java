package com.example.beautychen.study;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.beautychen.study.bean.Person;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Person p1=new Person("1");
        Person p2=new Person("2");

    }
}
