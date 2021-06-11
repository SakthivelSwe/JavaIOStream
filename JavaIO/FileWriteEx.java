package JavaIO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteEx {
    private static String file="C:\\Users\\elcot\\Desktop\\javaProjects\\ioexaplefils\\FileWriter.txt";
    public static void main(String[] args) throws IOException{
        FileWriter fw=new FileWriter(file);
        fw.write("I am sunil kumar, can avoid overthings in my mind");
        fw.close();
        System.out.println("Tast Completed");
    }
}
