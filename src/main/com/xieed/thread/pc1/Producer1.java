package com.xieed.thread.pc1;

public class Producer1 implements  Runnable {
    private MyList myList;

    public Producer1(MyList myList) {
        this.myList = myList;
    }

    @Override
    public void run() {
        try {
            while(true){
                this.myList.push();
            }
        } catch (InterruptedException e) {
            System.out.println("Producer exception");
        }
    }
}
