package com.xieed.cl;


import java.lang.reflect.Method;

//reference: https://www.journaldev.com/349/java-classloader
public class CCLoaderRun {

    public static void main(String args[]) throws Exception {
        String progClass = args[0];
        String progArgs[] = new String[args.length - 1];
        System.arraycopy(args, 1, progArgs, 0, progArgs.length);

        CCLoader ccl = new CCLoader(CCLoaderRun.class.getClassLoader());
        Class clas = ccl.loadClass(progClass);//Foo.class

        Class mainArgType[] = { (new String[0]).getClass() };
        Method main = clas.getMethod("main", mainArgType);//call Foo.main
        Object argsArray[] = { progArgs };
        main.invoke(null, argsArray);

        // Below method is used to check that the Foo is getting loaded
        // by our custom class loader i.e CCLoader
        Method printCL = clas.getMethod("printCL", (Class<?>) null);//call Foo.printCL
        printCL.invoke(null, new Object[0]);


        Bar1 bar1 = new Bar1();
        bar1.printCL();
        if(bar1.getClass() == Bar1.class){
            System.out.println("bar1.getClass == Bar.class");
        }


        System.out.println("String class loader:"+ String.class.getClassLoader());
    }

}
