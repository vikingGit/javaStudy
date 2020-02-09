package com.xieed.thread.io;

import java.io.IOException;
import java.io.PipedInputStream;

public class PipedReadData {
    public void readMethod(PipedInputStream input){
        try {
            System.out.println("Read: ");
            byte[] byteArray = new byte[20];
            int readLength = input.read(byteArray);
            while (readLength != -1){
                String newData = new String(byteArray, 0, readLength);
                System.out.println("read thread:" + newData);
                input.read(byteArray);
            }
            System.out.println();
            input.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
