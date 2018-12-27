package com.learning.java.file;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class OperationIO {
	
	public static final String filename = "Written.txt";

	public static void main(String[] args) throws IOException {

		String englishContent = "Hello";
		String kannadaContent = "ನಮಸ್ತೆ";
		
//		writeByteStream(englishContent + " " + kannadaContent);
		writeByteStream("ನ");
		readByteStream();
	
//		writeCharacterStream(englishContent + " " + kannadaContent, Charset.forName("UTF-8"));
//		readCharacterStream(Charset.forName("UTF-8"));
		
//		writeCharacterStream(englishContent + " " + kannadaContent, Charset.forName("UTF-8"));
//		readCharacterStream(Charset.forName("UTF-16"));

		readByteArrayInputStream();
	}

	public static void writeByteStream(String content) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream(filename);
		fileOutputStream.write(content.getBytes());
		fileOutputStream.close();
	}
	
	public static void readByteStream() throws IOException {
		FileInputStream fileInputStream = new FileInputStream(filename);

		int b;
		while( (b = fileInputStream.read()) != -1) {
			System.out.print(b);
			System.out.print((char) b + " \n");
			
		}
		fileInputStream.close();
	}
	public static void writeCharacterStream(String content, Charset cs) throws IOException {
		
		FileOutputStream fileOutputStream = new FileOutputStream(filename);
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, cs);
		
		outputStreamWriter.write(content);
		
		outputStreamWriter.close();
		fileOutputStream.close();
	}
	

	
	public static void readCharacterStream(Charset cs) throws IOException {
		
		int b;
		StringBuffer strBuffer = new StringBuffer();
		FileInputStream fileInputStream = new FileInputStream(filename);
//		Takes byte stream and gives character Stream
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, cs);
		while( (b = inputStreamReader.read()) != -1) {
			strBuffer = strBuffer.append((char) b);
		}
		
		System.out.println(strBuffer);
		
		fileInputStream.close();
		inputStreamReader.close();
	}
	
	public static void readByteArrayInputStream() {
		
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new byte[10]);
//		System.out.println("hello".getBytes().length);
		
	}
}
