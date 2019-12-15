package com.xieed.thread.pc;

public class Producer {

    private Object lock;
    private ValueObject value;


    public Producer(Object lock, ValueObject value) {
        this.lock = lock;
        this.value = value;
    }

    public void Produce() {
        synchronized (this.lock) {
            if (!this.value.getValue().equals("")) {
                try {
                    this.lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            this.value.setValue("Producer");
            System.out.println(Thread.currentThread().getName() + " set value:" + this.value);
            this.lock.notify();
        }
    }
}
