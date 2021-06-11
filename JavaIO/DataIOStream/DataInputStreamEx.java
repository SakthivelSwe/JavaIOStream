package JavaIO.DataIOStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamEx {
    private static String file="C:\\Users\\elcot\\Desktop\\javaProjects\\ioexaplefils\\DataIOStream.txt";
    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileInputStream fin=new FileInputStream(file);
        DataInputStream din=new DataInputStream(fin);
        System.out.println( din.readInt());
        System.out.println(din.readBoolean());
        System.out.println(din.readChar());
        System.out.println(din.readDouble());
        System.out.println(din.readLong());
        din.close();
        fin.close();
    }
}
