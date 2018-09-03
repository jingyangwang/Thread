package com.example.wangjingyang.threadbreak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        test();
    }

    public void test() {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            myThread.interrupt();
            while (true) {   //主线程将一直运行

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }

    }


    public void test2() {
        try {
            MyThread2 myThread = new MyThread2();
            myThread.start();
            myThread.interrupt();
            while (true) {   //主线程将一直运行

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }

    }

    public void test3() {
        try {
            MyThread3 myThread = new MyThread3();
            myThread.start();
            myThread.interrupt();
            while (true) {   //主线程将一直运行

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }

    }

    public void test4() {
        try {
            MyThread4 myThread = new MyThread4();
            myThread.start();
            myThread.interrupt();
            while (true) {   //主线程将一直运行

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }

    }


    //方法 一  用抛异常的方式停止线程操作
    class MyThread extends Thread {
        public void run() {
            try {
                while (true) {

                    if (isInterrupted()) {

                        new InterruptedException();
                    }
                }
            } catch (Exception e) {
                System.out.println("由于异常退出线程");
                e.printStackTrace();
            } finally {
                System.out.println("这是线程的finally");
            }
        }
    }


    //方法 二  用满足条件后 return返回 停止线程
    class MyThread2 extends Thread {
        public void run() {
            try {
                while (true) {

                    if (isInterrupted()) {

                        return;
                    }
                }
            } catch (Exception e) {
                System.out.println("return退出线程");
                e.printStackTrace();
            } finally {
                System.out.println("这是线程的return finally");
            }
        }
    }


    //方法 三  用满足条件后 break停止  不过此种方式存在弊端 因为break退出后 外部线程不会立即停止还会继续执行完毕
    class MyThread3 extends Thread {
        public void run() {
            try {
                while (true) {

                    if (isInterrupted()) {

                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println("由于break退出线程");
                e.printStackTrace();
            } finally {
                System.out.println("这是break线程的finally");
            }
        }
    }

    //其实还有方法四  就是打flag   flag放在线程外面进行判断，如果这个boolean类型的flag更改将不再执行了
    //一样存在弊端  本次执行完毕更改完变量，下次在执行的时候才能判断 不能执行 。
boolean flag=true;
    class MyThread4 extends Thread {
        public void run() {
            try {
                while (flag) {
                    flag=false;
                    if (isInterrupted()) {


                    }
                }
            } catch (Exception e) {
                System.out.println("由于flag退出线程");
                e.printStackTrace();
            } finally {
                System.out.println("这是flag线程的finally");
            }
        }
    }


}
