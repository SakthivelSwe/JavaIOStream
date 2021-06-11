package JavaIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {
    private static String file="C:\\Users\\elcot\\Desktop\\javaProjects\\ioexaplefils\\fileoutputstream.txt";
    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileInputStream fin=new FileInputStream(file);
        int i=0;
        while((i=fin.read())!=-1){
            System.out.print((char) i);
        }
    }
}
