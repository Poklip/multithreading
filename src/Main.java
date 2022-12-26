import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
/*
        new Thread(() -> {
                try {
                    sleep(5000L);
                    System.out.println("5 seconds passed.");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
        }).start();

        new Thread(() -> {
                try {
                    sleep(5004L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Scanner sc = new Scanner(System.in);
                System.out.print("Input a string: ");
                String string = sc.next();
                if (string.contains("g")) {
                    System.out.println("Your string has a \"G\" point.");
                } else {
                    System.out.println("Your string has no \"G\" point.");
                }
        }).start();

        System.out.println("Hi, I am just a code string in main class.");

        MyThread newMyRunnable = new MyThread();
        //new Thread(newMyRunnable).start();


        LinkedList<Integer> wordsCounter = new LinkedList<>();
        wordsCounter.add(0);
        new Thread(() -> {
            File warAndPeace = new File("D:/war_and_peace.txt");
            Parser parser = new Parser();
            wordsCounter.set(0, parser.parse(warAndPeace));
        }).start();

        new Thread(() -> {
            while (true) {
                try {
                    sleep(4000L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(wordsCounter.toArray()[0]);
            }
        }).start();
*/

        Timer timer = new Timer();
        new Thread(timer).start();

        new Thread(() -> {
            while (true) {
                if (timer.time % 5 == 0 && timer.time != 0) {
                    System.out.println("пять секунд прошло, но такой же код 2 минуты назад работать не хотел, охуенно");
                }
                try {
                    sleep(1000L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}
