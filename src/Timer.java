import static java.lang.Thread.sleep;

public class Timer implements Runnable {
    public int time = 0;
    @Override
    public synchronized void run() {
        while (true) {
            System.out.println(time + " sec.");
            try {
                sleep(1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            time ++;
        }
    }
}
