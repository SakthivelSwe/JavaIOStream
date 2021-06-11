package JavaIO;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx {
    private static String file="C:\\Users\\elcot\\Desktop\\javaProjects\\ioexaplefils\\BufferedOutputStream.txt";
    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileOutputStream fout=new  FileOutputStream(file);
        BufferedOutputStream bout= new BufferedOutputStream(fout);
        String s="Sunilkumar";
        byte b[]=s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("Task completed");

    }
}
