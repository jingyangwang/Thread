package Thread;

import android.util.Log;

public class MyThread3 extends Thread {
    private volatile boolean flag = true;

    public void stopTask() {
        flag = false;
    }

    public MyThread3(String name) {
        super(name);
    }

    @Override
    public void run() {
        synchronized (this) {
            try {
                int i = 0;
                while (flag) {
                    Thread.sleep(100); // 休眠100ms
                    i++;
//                    System.out.println(Thread.currentThread().getName() + " (" + this.getState() + ") loop " + i);
                    Log.i("debug2121211", Thread.currentThread().getName() + " (" + this.getState() + ") loop " + i);
                }

            } catch (InterruptedException ie) {
//                System.out.println(Thread.currentThread().getName() + " (" + this.getState() + ") catch InterruptedException.");

                Log.i("debug2121211", Thread.currentThread().getName() + " (" + this.getState() + ") catch InterruptedException.");
            }
        }
    }
}
