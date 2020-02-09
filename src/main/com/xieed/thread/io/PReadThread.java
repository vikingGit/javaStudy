package com.xieed.thread.io;

import java.io.PipedInputStream;

public class PReadThread implements Runnable {
    private final PipedReadData reader;
    private final PipedInputStream inputStream;

    public PReadThread(PipedReadData reader, PipedInputStream inputStream) {
        this.reader = reader;
        this.inputStream = inputStream;
    }

    @Override
    public void run() {
        this.reader.readMethod(inputStream);
    }
}
