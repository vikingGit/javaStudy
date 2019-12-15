package com.xieed.thread;

public class ClassLockThread2 extends Thread {
    private final ClassLockService service;

    public ClassLockThread2(ClassLockService service) {
        this.service = service;
    }

    @Override
    public void run() {
        this.service.printB();
    }
}
