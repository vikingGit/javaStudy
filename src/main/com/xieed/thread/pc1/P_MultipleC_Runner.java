package com.xieed.thread.pc1;

public class P_MultipleC_Runner {
    public static void main(String[] args) {
        MyList myList = new MyList();
        Thread pThread = new Thread(new Producer1(myList));
        Thread cThread = new Thread(new Consumer1(myList));
        Thread cThread1 = new Thread(new Consumer1(myList));
        Thread cThread2 = new Thread(new Consumer1(myList));
        Thread cThread3 = new Thread(new Consumer1(myList));

        pThread.start();
        cThread.start();
        cThread1.start();
        cThread2.start();
        cThread3.start();
    }
}
