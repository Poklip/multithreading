public class MyThread implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(20000L);
            System.out.println("20 seconds passed.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
