package com.example.wangjingyang.threadbreak;

import android.util.Log;

import  Thread.*;
public class SingleDemo2 {

    public static  void test(){

        try {
            MyThread2 t2=new MyThread2("t2");
//            System.out.println(t2.getName() +" ("+t2.getState()+") is new.");
            Log.i("debug2121211", t2.getName() + " (" + t2.getState() + ") is new.");
            t2.start();
//            System.out.println(t2.getName() +" ("+t2.getState()+") is started.");
            Log.i("debug2121211", t2.getName() +" ("+t2.getState()+") is started.");
            Thread.sleep(300);
            t2.interrupt();
//            System.out.println(t2.getName() +" ("+t2.getState()+") is interrupted.");
            Log.i("debug2121211", t2.getName() +" ("+t2.getState()+") is interrupted.");
            Thread.sleep(300);
//            System.out.println(t2.getName() +" ("+t2.getState()+") is interrupted now.");
            Log.i("debug2121211",t2.getName() +" ("+t2.getState()+") is interrupted now.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

/*
*
* 09-03 18:48:32.907 18832-18832/com.example.wangjingyang.threadbreak I/debug2121211: t2 (NEW) is new.
09-03 18:48:32.908 18832-18832/com.example.wangjingyang.threadbreak I/debug2121211: t2 (RUNNABLE) is started.
09-03 18:48:33.008 18832-18867/com.example.wangjingyang.threadbreak I/debug2121211: t2 (RUNNABLE) loop 1
09-03 18:48:33.108 18832-18867/com.example.wangjingyang.threadbreak I/debug2121211: t2 (RUNNABLE) loop 2
09-03 18:48:33.208 18832-18832/com.example.wangjingyang.threadbreak I/debug2121211: t2 (RUNNABLE) is interrupted.
09-03 18:48:33.208 18832-18867/com.example.wangjingyang.threadbreak I/debug2121211: t2 (RUNNABLE) catch InterruptedException.
    t2 (RUNNABLE) loop 3
09-03 18:48:33.308 18832-18867/com.example.wangjingyang.threadbreak I/debug2121211: t2 (RUNNABLE) loop 4
09-03 18:48:33.409 18832-18867/com.example.wangjingyang.threadbreak I/debug2121211: t2 (RUNNABLE) loop 5
09-03 18:48:33.508 18832-18832/com.example.wangjingyang.threadbreak I/debug2121211: t2 (TIMED_WAITING) is interrupted now.
09-03 18:48:33.509 18832-18867/com.example.wangjingyang.threadbreak I/debug2121211: t2 (RUNNABLE) loop 6
09-03 18:48:33.609 18832-18867/com.example.wangjingyang.threadbreak I/debug2121211: t2 (RUNNABLE) loop 7
*
*
* */

    }

}
