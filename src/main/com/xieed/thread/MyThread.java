package com.xieed.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        try{
        for (int i = 0; i < 10000000; i++) {
            System.out.println("###"+ i);
            System.out.println("run threadName="
                    + this.currentThread().getName() + " begin = "
                    + System.currentTimeMillis());
                Thread.sleep(1000);
            System.out.println("###"+ i +"a");
            }
        }catch (InterruptedException e){
            System.out.println("interrupt exception");
        }
    }
}
