package com.xieed.thread.pc;

public class ConsumerThread implements Runnable {
    private  Consumer s;

    public ConsumerThread(Consumer s) {
        this.s = s;
    }

    public void run() {
        while (true) {
            this.s.consume();
        }
    }
}
