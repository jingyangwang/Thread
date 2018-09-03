package Thread;

import android.util.Log;

public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            int i = 0;
            while (!isInterrupted()) {
                Thread.sleep(100);
                i++;
//                System.out.println(Thread.currentThread().getName() + " (" + this.getState() + ") loop " + i);
                Log.i("debug2121211",Thread.currentThread().getName() + " (" + this.getState() + ") loop " + i);
            }
        } catch (InterruptedException e) {
//            System.out.println(Thread.currentThread().getName() + " (" + this.getState() + ") catch InterruptedException.");
            Log.i("debug2121211",Thread.currentThread().getName() + " (" + this.getState() + ") catch InterruptedException.");
        }
    }
}
