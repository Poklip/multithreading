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

        //проработка асинхронных потоков
        //        System.out.println("Запуск программы.");
//        Thread test_1 = new Thread(() -> {
//            int count = 0;
//            while (true) {
//                try {
//                    sleep(1000L);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                count ++;
//                System.out.println(count);
//            }
//        });
//
//        Thread test_2 = new Thread(() -> {
//            int count_2 = 0;
//            while (true) {
//                try {
//                    sleep(5000L);
//                    count_2 += 5;
//                    System.out.println("прошло: " + count_2);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        });
//
//        Thread test_3 = new Thread(() -> {
//            int count_3 = 0;
//            while (true) {
//                try {
//                    sleep(7000L);
//                    count_3 += 7;
//                    System.out.println("прошло: " + count_3);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        });
//
//        test_1.start();
//        test_2.start();
//        test_3.start();

        Timer timer = new Timer(0, 1);
        new Thread(timer).start();

        new Thread(() -> {
            while (true) {
                if (timer.time % 5 == 0 && timer.time != 0 && timer.time % 7 == 0) {
                    System.out.println("5 & 7 seconds passed.");
                } else if (timer.time % 5 == 0 && timer.time != 0) {
                    System.out.println("5 seconds passed.");
                } else if (timer.time % 7 == 0 && timer.time != 0) {
                    System.out.println("7 seconds passed.");
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
