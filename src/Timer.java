import java.sql.SQLOutput;

import static java.lang.Thread.sleep;

public class Timer implements Runnable {

    public int time = 0;
    private int showable = 0;

    public Timer (int time, int showable) {
        this.time = time;
        this.showable = showable;
    }
    @Override
    public void run() {
        while (true) {
            try {
                if (showable == 1) {
                    System.out.println(time + " sec.");
                }
                sleep(1000L);
                synchronized (this) {
                    time ++;
                    this.notifyAll();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
