package com.pd.pdmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //启线程
        MyThread myThread=new MyThread();
        myThread.start();
    }
    //内部类
    class  MyThread extends  Thread
    {
        @Override
        public void run() {
            try{
                //停3秒
                sleep(3000);
                //跳到LoginActiviyt
                //从mainActivity跳到LoginActivity
                Intent intent=new Intent(MainActivity.this,LoginActivity.class);
                //开始跳到loginActivity
                startActivity(intent);
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
