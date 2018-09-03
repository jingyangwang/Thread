package com.example.wangjingyang.threadbreak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        test();
    }

    //   终止处于运行状态的线程
// 通常，我们通过“标记”方式终止处于“运行状态”的线程。
// 其中，包括“中断标记”和“额外添加标记”。
    public void test() {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.interrupt();


    }

    //    中断标记 停止线程
    class MyThread extends Thread {
        public void run() {
//            如果不符标识 将不执行线程内部逻辑
            while (!isInterrupted()) {

            }
        }


    }


    public void test2() {
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();
        myThread2.stopFalse();
    }


    //    额外添加标记，进行停止线程
    class MyThread2 extends Thread {
        public void stopFalse() {
            flag = false;
        }

        public volatile boolean flag = true;

        public void run() {
            while (flag) {

            }

        }
    }


}
