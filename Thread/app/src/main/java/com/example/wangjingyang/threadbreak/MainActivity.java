package com.example.wangjingyang.threadbreak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test();
    }
/*
*
* interrupt()方法为为调用该方法的线程对象设置一个中断标志，注意！这里是设置一个中断标志，丝毫不耽误线程没羞没臊的运行。请看例子
*
* */
    public void test() {

        try {
            MyThread thread=new MyThread();
            thread.start();
            thread.interrupt();//thread 打上中断标识
            Log.i("debug2121211","执行了interrupt方法");


        } catch (Exception e) {
            e.printStackTrace();

        } finally {

        }


    }

    class MyThread extends Thread {
        public void run() {
            try {
                for (int i = 0; i < 5000; i++) {
                    System.out.println(i);
                    Log.i("debug2121211", "i " + i);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

}
