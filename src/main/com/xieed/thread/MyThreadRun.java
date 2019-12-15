package com.xieed.thread;

public class MyThreadRun {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        try {
            Thread.sleep(1000);
            myThread.interrupt();
//            myThread.stop();
        } catch (InterruptedException e) {
            System.out.println("aaa");
        }

    }
}
