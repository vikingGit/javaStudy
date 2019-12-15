package com.xieed.thread.pc1;

public class P_C_Runner {
    public static void main(String[] args) {
        MyList myList = new MyList();
        Thread pThread = new Thread(new Producer1(myList));
        Thread cThread = new Thread(new Consumer1(myList));

        pThread.start();
        cThread.start();
    }
}
