package Thread;

import android.util.Log;

public class MyThread2 extends Thread {
    public MyThread2(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 0;
        while (!isInterrupted()) {
            try {
                Thread.sleep(100);

            } catch (Exception e) {
//                System.out.println(Thread.currentThread().getName() + " (" + this.getState() + ") catch InterruptedException.");
                Log.i("debug2121211",Thread.currentThread().getName() + " (" + this.getState() + ") catch InterruptedException.");
            }
            i++;
//            System.out.println(Thread.currentThread().getName() + " (" + this.getState() + ") loop " + i);
            Log.i("debug2121211",Thread.currentThread().getName() + " (" + this.getState() + ") loop " + i);
        }

    }
}
