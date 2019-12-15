package com.xieed.cl;

public class Bar1 {
    String name;

    public void printCL(){
        System.out.println("Bar1 class loader:" + Bar.class.getClassLoader());
    }
}
