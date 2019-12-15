package com.xieed.thread.pc1;

public class Consumer1 implements Runnable {

    private MyList myList;

    public Consumer1(MyList myList) {
        this.myList = myList;
    }

    @Override
    public void run() {
        try {
            while(true){
                this.myList.pop();
            }
        } catch (InterruptedException e) {
            System.out.println("Consumer exception");
        }
    }
}
