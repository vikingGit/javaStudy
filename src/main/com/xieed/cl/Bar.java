package com.xieed.cl;

//reference: https://www.journaldev.com/349/java-classloader
public class Bar {

    public Bar(String a, String b) {
        System.out.println("Bar Constructor >>> " + a + " " + b);
    }

    public void printCL() {
        System.out.println("Bar ClassLoader: "+Bar.class.getClassLoader());
    }
}