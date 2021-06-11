package JavaIO;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class byteArrayOutputStreamEx {
    private static String file1="C:\\Users\\elcot\\Desktop\\javaProjects\\ioexaplefils\\byteArray1.txt";
    private static String file2="C:\\Users\\elcot\\Desktop\\javaProjects\\ioexaplefils\\byteArray2.txt";
    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileOutputStream input1=new FileOutputStream(file1);
        FileOutputStream input2=new FileOutputStream(file2);
        ByteArrayOutputStream byteA=new ByteArrayOutputStream();
        String word="TonyStark";
        byte byets[]=word.getBytes();
        byteA.write(byets);
        byteA.writeTo(input1);
        byteA.writeTo(input2);
        byteA.flush();
        byteA.close();
        System.out.println("Test completed");
    }
}
