package com.xieed.thread.pc;

public class ProducerThread implements Runnable {
    private Producer p;

    public ProducerThread(Producer p) {
        this.p = p;
    }

    public void run() {
        while (true) {
            this.p.Produce();
        }
    }
}

