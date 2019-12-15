package com.xieed.thread;

public class ClassLockService {
    public void printA(){
        synchronized (ClassLockService.class){
            System.out.println("线程名称为：" + Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"进入printA");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程名称为：" + Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"离开printA");
        }
    }

    public void printB(){
        synchronized (ClassLockService.class){
            System.out.println("线程名称为：" + Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"进入printB");
            System.out.println("线程名称为：" + Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"离开printB");

        }
    }

    public void printC(){
        synchronized (this){//printC 与printA/printB 不同步： 对象锁和class锁不同步
            System.out.println("线程名称为：" + Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"进入printC");
            System.out.println("线程名称为：" + Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"离开printC");

        }
    }
}
