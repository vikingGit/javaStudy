package com.xieed.thread.io;

import java.io.IOException;
import java.io.PipedOutputStream;

public class PipedWriteData {
    public void writeMethod(PipedOutputStream out){
        try{
            System.out.println("Write:");
            for (int i = 0; i < 300; i++) {
                String outData = "" + (i + 1);
                out.write(outData.getBytes());
                System.out.println("write thread:" + outData);
            }
            out.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
