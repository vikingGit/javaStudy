package com.xieed.thread.pc;

public class ProdConsumerRunner {

    public static void main(String[] args) {
        ValueObject valueObject = new ValueObject();
        Object lock = new Object();

        Thread pThread = new Thread(new ProducerThread(new Producer(lock, valueObject)));
        pThread.setName("Producer Thread");
        pThread.start();

        Thread cThread = new Thread(new ConsumerThread(new Consumer(lock, valueObject)));
        cThread.setName("Consumer Thread");
        cThread.start();
//
//        Thread pThread = new Thread(new ProducerThread(new Producer(lock, strValue)));
//        pThread.setName("Producer Thread");
//        pThread.start();

    }


}
