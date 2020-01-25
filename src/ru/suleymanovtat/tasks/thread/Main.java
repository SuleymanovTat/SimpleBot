package ru.suleymanovtat.tasks.thread;

public class Main {

    public static void main(String[] args) {
        Object obj = new Object();
        Thread thread = new Thread(new Runnable() {
            int count = 0;

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("print " + i);
                    count++;
                    if (5 == i) {
                        try {
                            synchronized (obj) {
                                obj.wait();
                            }
                        } catch (Exception e) {
                            System.out.println("print error " + e.getMessage());
                        }
                    }
                }
            }
        });
        thread.setName("Thread name");
        thread.start();

        try {
            System.out.println("sleep 5000");
            Thread.sleep(5000);
            synchronized (obj) {
                System.out.println("notify");
                obj.notify();
                System.out.println("notify 2");
            }
        } catch (Exception e) {
            System.out.println("Exception " + e.getMessage());
        }
    }
}
