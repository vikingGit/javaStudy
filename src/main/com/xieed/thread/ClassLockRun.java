package com.xieed.thread;

public class ClassLockRun {
    public static void main(String[] args) {
        ClassLockService service1 = new ClassLockService();
        ClassLockService service2 = new ClassLockService();
        ClassLockThread1 classLockThread1 = new ClassLockThread1(service1);
        ClassLockThread2 classLockThread2 = new ClassLockThread2(service2);
        classLockThread1.start();
        classLockThread2.start();
    }
}
