package com.xieed.thread.pc;

public class Consumer {
    Object lock;
    ValueObject value;

    public Consumer(Object lock, ValueObject value) {
        this.lock = lock;
        this.value = value;
    }

    public void consume(){
        synchronized (this.lock) {
            if (this.value.getValue().equals("")) {
                try {
                    System.out.println(Thread.currentThread().getName() + " wating..." + this.value);
                    this.lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " clear value");
            this.value.setValue("");
            this.lock.notify();
        }
    }
}
