package com.example.wangjingyang.threadbreak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        test();
    }

    public void test() {

        try {
            MyThread thread = new MyThread();
            thread.start();
            thread.interrupt();

            //显示的是主线程的中断状态，所以显示false
//            System.out.println("调用interrupted():  " + thread.interrupted());
            Log.i("debug2121211","调用interrupted():  " + thread.interrupted());
            //main主线程调用interrupt()，是主线程状态为中断
            Thread.currentThread().interrupt();

            //这里也可以使用Thread.currentThread().interrupted(),效果是一样的，具体原因看上面介绍
//            System.out.println("第一次调用interrupted():  " + thread.interrupted());
            Log.i("debug2121211","第一次调用interrupted():  " + thread.interrupted());
            //第二次调用，interrupted()方法又将状态恢复
//            System.out.println("第二次调用interrupted():  " + thread.interrupted());
            Log.i("debug2121211","第二次调用interrupted():  " + thread.interrupted());
//            System.out.println("-------------------------------------------------");
            Log.i("debug2121211","-------------------------------------------------");
            //而isInterrupted()返回的是调用者线程的中断状态，而且多次调用状态不会恢复
//            System.out.println("第一次调用isInterrupted():  " + thread.isInterrupted());
            Log.i("debug2121211","第一次调用isInterrupted():  " + thread.isInterrupted());
//            System.out.println("第二次调用isInterrupted():  " + thread.isInterrupted());
            Log.i("debug2121211","第二次调用isInterrupted():  " + thread.isInterrupted());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }





class MyThread extends Thread {
    public void run() {
        while (true) {

        }


    }
}

}
