package com.example.wangjingyang.threadbreak;

import android.util.Log;

import Thread.MyThread;

public class SingleDemo {

    public static void test() {
        try {
            MyThread t1 = new MyThread("t1");  // 新建“线程t1”
//                         System.out.println(t1.getName() +" ("+t1.getState()+") is new.");
            Log.i("debug2121211", t1.getName() + " (" + t1.getState() + ") is new.");
            t1.start();                      // 启动“线程t1”
//                       System.out.println(t1.getName() +" ("+t1.getState()+") is started.");
            Log.i("debug2121211", t1.getName() + " (" + t1.getState() + ") is started.");
            // 主线程休眠300ms，然后主线程给t1发“中断”指令。
            Thread.sleep(300);
            t1.interrupt();
//                         System.out.println(t1.getName() +" ("+t1.getState()+") is interrupted.");
            Log.i("debug2121211", t1.getName() + " (" + t1.getState() + ") is interrupted.");
            // 主线程休眠300ms，然后查看t1的状态。
            Thread.sleep(300);
//                        System.out.println(t1.getName() +" ("+t1.getState()+") is interrupted now.");
            Log.i("debug2121211", t1.getName() + " (" + t1.getState() + ") is interrupted now.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
/*
*
* 09-03 18:49:23.691 19498-19498/com.example.wangjingyang.threadbreak I/debug2121211: t1 (NEW) is new.
    t1 (RUNNABLE) is started.
09-03 18:49:23.792 19498-19525/com.example.wangjingyang.threadbreak I/debug2121211: t1 (RUNNABLE) loop 1
09-03 18:49:23.892 19498-19525/com.example.wangjingyang.threadbreak I/debug2121211: t1 (RUNNABLE) loop 2
09-03 18:49:23.992 19498-19498/com.example.wangjingyang.threadbreak I/debug2121211: t1 (RUNNABLE) is interrupted.
09-03 18:49:23.992 19498-19525/com.example.wangjingyang.threadbreak I/debug2121211: t1 (RUNNABLE) catch InterruptedException.
09-03 18:49:24.292 19498-19498/com.example.wangjingyang.threadbreak I/debug2121211: t1 (TERMINATED) is interrupted now.
*
* */

}
