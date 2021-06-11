package JavaIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamEx {
    private static String file="C:\\Users\\elcot\\Desktop\\javaProjects\\ioexaplefils\\BufferedOutputStream.txt";
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fin=new FileInputStream(file);
        BufferedInputStream bin=new BufferedInputStream(fin);
        int i=0;
        while((i=bin.read())!=-1){
            System.out.print((char) i);
        }
        fin.close();
        bin.close();

    }
}
