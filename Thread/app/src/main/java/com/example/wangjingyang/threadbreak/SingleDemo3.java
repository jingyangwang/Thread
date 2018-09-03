package com.example.wangjingyang.threadbreak;

import android.util.Log;

import Thread.MyThread3;

public class SingleDemo3 {

    public static  void test(){

        try {
            MyThread3 t3=new MyThread3("t3");
//            System.out.println(t2.getName() +" ("+t2.getState()+") is new.");
            Log.i("debug2121211", t3.getName() + " (" + t3.getState() + ") is new.");
            t3.start();
//            System.out.println(t2.getName() +" ("+t2.getState()+") is started.");
            Log.i("debug2121211", t3.getName() +" ("+t3.getState()+") is started.");
            Thread.sleep(300);
            t3.interrupt();
//            System.out.println(t2.getName() +" ("+t2.getState()+") is interrupted.");
            Log.i("debug2121211", t3.getName() +" ("+t3.getState()+") is interrupted.");
            Thread.sleep(300);
//            System.out.println(t2.getName() +" ("+t2.getState()+") is interrupted now.");
            Log.i("debug2121211",t3.getName() +" ("+t3.getState()+") is interrupted now.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
/*
*
* 09-03 18:47:00.580 17611-17611/com.example.wangjingyang.threadbreak I/debug2121211: t3 (NEW) is new.
09-03 18:47:00.581 17611-17611/com.example.wangjingyang.threadbreak I/debug2121211: t3 (RUNNABLE) is started.
09-03 18:47:00.681 17611-17642/com.example.wangjingyang.threadbreak I/debug2121211: t3 (RUNNABLE) loop 1
09-03 18:47:00.782 17611-17642/com.example.wangjingyang.threadbreak I/debug2121211: t3 (RUNNABLE) loop 2
09-03 18:47:00.881 17611-17611/com.example.wangjingyang.threadbreak I/debug2121211: t3 (RUNNABLE) is interrupted.
09-03 18:47:00.882 17611-17642/com.example.wangjingyang.threadbreak I/debug2121211: t3 (RUNNABLE) catch InterruptedException.
09-03 18:47:01.182 17611-17611/com.example.wangjingyang.threadbreak I/debug2121211: t3 (TERMINATED) is interrupted now.
*
* */


    }

}
