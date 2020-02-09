package com.xieed.thread.io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PR_PW_Runner {
    public static void main(String[] args) {
        PipedInputStream input = new PipedInputStream();
        PipedOutputStream out = new PipedOutputStream();
        try {
            out.connect(input);

            Thread readThread = new Thread(new PReadThread(new PipedReadData(), input));
            readThread.start();

            Thread.sleep(2000);

            Thread writeThread = new Thread(new PWriteThread(new PipedWriteData(), out));
            writeThread.start();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
