package com.example.beautychen.study;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.example.beautychen.study.bean.Person;

import java.util.Timer;
import java.util.TimerTask;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Timer t=new Timer();
    /*    while (true){
            disableKey();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/
    }

    private void disableKey(){
        Log.v(TAG,"尝试解锁");
        KeyguardManager km= (KeyguardManager)getSystemService(Context.KEYGUARD_SERVICE);
        KeyguardManager.KeyguardLock kl = km.newKeyguardLock("unLock");
        //解锁
        kl.disableKeyguard();
    }

    @OnClick({R.id.btn_1, R.id.btn_2, R.id.btn_3, R.id.btn_4, R.id.btn_5, R.id.btn_6, R.id.btn_7, R.id.btn_8, R.id.btn_9})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_1:
                DeviceMethod.getInstance(this).onActivate();
                break;
            case R.id.btn_2:
                DeviceMethod.getInstance(this).onRemoveActivate();
                break;
            case R.id.btn_3:
                DeviceMethod.getInstance(this).startLockMethod();
                break;
            case R.id.btn_4:
                DeviceMethod.getInstance(this).setLockMethod();
                break;
            case R.id.btn_5:
                DeviceMethod.getInstance(this).LockNow();
                break;
            case R.id.btn_6:
                DeviceMethod.getInstance(this).LockByTime(10);
                break;
            case R.id.btn_7:
                DeviceMethod.getInstance(this).WipeData();
                break;
            case R.id.btn_8:
                DeviceMethod.getInstance(this).setPassword("0000");
                break;
            case R.id.btn_9:
                DeviceMethod.getInstance(this).test();
                break;
        }
    }
}
