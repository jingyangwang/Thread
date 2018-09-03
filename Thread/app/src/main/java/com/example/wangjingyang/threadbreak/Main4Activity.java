package com.example.wangjingyang.threadbreak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    //    2.1 终止处于“阻塞状态”的线程
    public void test() {
        MyThread myThread=new MyThread();
        myThread.start();
        myThread.interrupt();

    }


//    当线程由于被调用了sleep(), wait(), join()等方法而进入阻塞状态；若此时调用线程的interrupt()将线程的中断标记设为true。
// 由于处于阻塞状态，中断标记会被清除，同时产生一个InterruptedException异常。将InterruptedException放在适当的为止就能终止线程
    class MyThread extends Thread {
        public void run() {
            while (true) {
                try {
                    // 执行任务...
                } catch (Exception ie) {
                     // InterruptedException
                    // InterruptedException在while(true)循环体内。
                    // 当线程产生了InterruptedException异常时，while(true)仍能继续运行！需要手动退出
                    break;
                }
            }
        }
    }


}
