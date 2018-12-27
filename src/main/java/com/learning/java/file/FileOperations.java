package com.learning.java.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.learning.java.domainobjects.Circle;

public class FileOperations {

	private String filename;
	private File file;

	FileOperations(String filename) {
		this.filename = filename;
	}

	public void writeToFile(Object dataObject) {
		File file = null;
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;

		try {
			file = new File(this.filename);
			fileOutputStream = new FileOutputStream(file);

			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(dataObject);

		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if (fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (objectOutputStream != null) {
				try {
					objectOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public Object readFromFile(String filename) {

		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		Object readObject = null;
		try {
			fileInputStream = new FileInputStream(new File(filename));

			objectInputStream = new ObjectInputStream(fileInputStream);
			readObject = objectInputStream.readObject();
		} catch (IOException ioe) {
			System.out.println(ioe);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (objectInputStream != null) {
				try {
					objectInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return (Object) readObject;
	}
}
