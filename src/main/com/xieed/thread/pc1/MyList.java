package com.xieed.thread.pc1;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    private List<String> prodList = new ArrayList<>();

    public synchronized void push() throws InterruptedException {
        while (this.prodList.size() > 0) {
            System.out.println("prod size:" + this.prodList.size());
            this.wait();
        }

        this.prodList.add("flower");
        this.notify();
        System.out.println("push:" + this.prodList.size());
    }

    public synchronized void pop() throws InterruptedException {
        //用while 替换if，consumer每一次被唤醒需要重新再判断prodList.isEmpty，因为可能是被其它consumer唤醒，其他cosumer已经执行remove操作，list的size就变成0了
        while (this.prodList.isEmpty()) {
            this.wait();
        }

        this.prodList.remove(0);
        //notifyAll代替notify避免假死状态，因为notify可能只唤醒consumer，导致producer没有机会执行，从而prodList.isEmpty一直为true，最终所有consumer一直waiting
        this.notifyAll();
        System.out.println("pop:" + this.prodList.size());

    }
}
