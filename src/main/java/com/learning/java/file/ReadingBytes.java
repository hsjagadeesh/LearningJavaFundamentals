package com.learning.java.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class ReadingBytes {

	public static void main(String[] args) throws IOException {
		
//		String inputFileName = "SampleAudio.mp3";
		String inputFileName = "MInput.txt";
		
//		Reads Byte by Byte -> Give Byte Stream
		FileInputStream fileInputStream = new FileInputStream(inputFileName);
		int b;
		
		System.out.println("Printing byte read from FileInputStream as int");
		while( (b = fileInputStream.read()) != -1) {
			System.out.print(b + " . ");
		}
		System.out.println("\n");
		fileInputStream.close();

		System.out.println("Printing byte read from FileInputStream as char");
		fileInputStream = new FileInputStream(inputFileName);
		while( (b = fileInputStream.read()) != -1) {
			System.out.print((char) b);
		}
		System.out.println("\n");
		fileInputStream.close();

		System.out.println("Passing byte read by fileInputStream to InputStreamReader to get and print as int");
		fileInputStream = new FileInputStream(inputFileName);
//		Takes byte stream and gives character Stream
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
		while( (b = inputStreamReader.read()) != -1) {
			System.out.print(b);
		}
		System.out.println("\n");
		
		System.out.println("Reads byte from stream/file -> [FileInputStream] ->  : Takes byte and produces byte to InputStreamReader to get and print as char");
		fileInputStream = new FileInputStream(inputFileName);
//		Takes byte stream and gives character Stream
		inputStreamReader = new InputStreamReader(fileInputStream, Charset.defaultCharset());
		while( (b = inputStreamReader.read()) != -1) {
			System.out.print((char) b);
		}
		System.out.println("\n");

//		Takes Byte -> Gives Byte Stream
//		FileOutputStream fileOutputStream = new FileOutputStream("KOutput.txt");
		
//		int c;
//		while((c = (char) fileInputStream.read()) != -1) {
//			System.out.println();
//			fileOutputStream.write(c);
//		}
		
//		int read;
//		while((read = fileInputStream.read()) != -1) {
//			System.out.print((char) read);
//			fileOutputStream.write(read);
//		}
//		

		inputStreamReader.close();

		fileInputStream.close();
//		fileOutputStream.close();
	}

}
