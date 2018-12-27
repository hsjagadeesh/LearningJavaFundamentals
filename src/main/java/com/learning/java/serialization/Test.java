package com.learning.java.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test{

    public static void main (String args[]) throws IOException, ClassNotFoundException{
        A a = new A();

        B b = new B();
        b.a = a;

        C c = new C();
        c.a = a;

        System.out.println("b.a == c.a is " + (b.a == c.a));

        // Case 1 - when two diferent files are used to write the objects
        FileOutputStream fout = new FileOutputStream("b.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        oos.writeObject(b);
        oos.close();
        fout.close();

        fout = new FileOutputStream("c.ser");
        oos = new ObjectOutputStream(fout);
        oos.writeObject(c);
        oos.close();
        fout.close();

        FileInputStream fileIn = new FileInputStream("b.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        B bCopy = (B) in.readObject();
        in.close();
        fileIn.close();

        fileIn = new FileInputStream("c.ser");
        in = new ObjectInputStream(fileIn);
        C cCopy = (C) in.readObject();
        in.close();
        fileIn.close();
        System.out.println("Case 1 - bCopy.a == cCopy.a is " + (bCopy.a == cCopy.a));

        // Case 2 - when both the objects are saved in the same file
        fout = new FileOutputStream("both.ser");
        oos = new ObjectOutputStream(fout);
        oos.writeObject(b);
        oos.writeObject(c);
        oos.close();
        fout.close();


        fileIn = new FileInputStream("both.ser");
        in = new ObjectInputStream(fileIn);
        bCopy = (B) in.readObject();
        cCopy = (C) in.readObject();
        
        A aObject = (A) in.readObject();
        System.out.println(aObject);
        
        in.close();
        fileIn.close();
        System.out.println("Case 2 - bCopy.a == cCopy.a is " + (bCopy.a == cCopy.a));
        
        System.out.println();
        
        System.out.println("b.equals(bCopy)" + b.equals(bCopy));
        
        System.out.println();
        
        System.out.println("b.toString()" + b.toString());
        System.out.println("b.hashCode()" + b.hashCode());
        System.out.println("b.equals(b)" + b.equals(b));
        
        System.out.println();
        
        System.out.println("bCopy.toString()" + bCopy.toString());
        System.out.println("bCopy.hashCode()" + bCopy.hashCode());
        System.out.println("bCopy.equals(b)" + bCopy.equals(bCopy));
        
    }
}

class A implements Serializable{

}

class B implements Serializable {
	
	private static final long serialVersionUID = -762351949591072276L;
	A a;
}

class C implements Serializable{

	private static final long serialVersionUID = -760809113126959822L;
	A a;
}