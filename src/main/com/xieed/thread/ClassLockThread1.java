package com.xieed.thread;

public class ClassLockThread1 extends Thread {
    private final ClassLockService service;

    public ClassLockThread1(ClassLockService service) {
        this.service = service;
    }

    @Override
    public void run() {
        this.service.printA();
    }
}
