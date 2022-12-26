public class periodChecker implements Runnable{
    Timer timer;
    int periodLength;
    public periodChecker(Timer timer, int periodLength) {
        this.timer = timer;
        this.periodLength = periodLength;
    }
    @Override
    public synchronized void run() {
        while (timer.time % periodLength == 0 && timer.time != 0) {
            System.out.println(periodLength + " seconds passed.");
        }
    }
}
