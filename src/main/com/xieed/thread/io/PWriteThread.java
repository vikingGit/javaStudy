package com.xieed.thread.io;

import java.io.PipedOutputStream;

public class PWriteThread implements Runnable {
    private final PipedWriteData writer;
    private final PipedOutputStream outStream;

    public PWriteThread(PipedWriteData writer, PipedOutputStream outStream) {
        this.writer = writer;
        this.outStream = outStream;
    }

    @Override
    public void run() {
        this.writer.writeMethod(outStream);
    }
}
