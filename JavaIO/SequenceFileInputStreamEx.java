package JavaIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceFileInputStreamEx {
    private static String file1="C:\\Users\\elcot\\Desktop\\javaProjects\\ioexaplefils\\fileoutputstream.txt";
    private static String file2="C:\\Users\\elcot\\Desktop\\javaProjects\\ioexaplefils\\BufferedOutputStream.txt";
    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileInputStream input1=new FileInputStream(file1);
        FileInputStream input2=new FileInputStream(file2);
        SequenceInputStream inst=new SequenceInputStream(input1,input2);
        int i=0;
        while((i=inst.read())!=-1){
            System.out.print((char) i);
        }
        inst.close();
        input1.close();
        input2.close();
    }

}
