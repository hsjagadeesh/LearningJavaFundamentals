package com.learning.java.file.bytestream;

import java.io.*;

public class DataInputStreamExample {
    public static void main(String[] args) throws IOException {
        DataInputStream dataIn = new DataInputStream(new FileInputStream("Tanush.jpg"));
        DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("OutputImage.jpeg"));

        int c;
        while ((c = dataIn.read()) != -1) {
            dataOut.write(c);
        }

        if (dataIn != null) {
            dataIn.close();
        }
        if (dataOut != null) {
            dataOut.close();
        }
        System.out.println("Done");
    }
}
