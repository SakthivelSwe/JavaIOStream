package JavaIO;

import java.io.*;
import java.io.FileReader;

class FileReaderin{
    private static String file="C:\\Users\\elcot\\Desktop\\javaProjects\\ioexaplefils\\BufferWriter.txt";
    public void display(){
        try {
            FileReader r1 = new FileReader(file);
            int i=0;
            while((i=r1.read())!=-1){
                System.out.print((char) i);
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
    }

}

public class BufferWriterEx {
    private static String file="C:\\Users\\elcot\\Desktop\\javaProjects\\ioexaplefils\\BufferWriter.txt";
    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileWriter writer=new FileWriter(file);
        BufferedWriter Buffer=new BufferedWriter(writer);
        Buffer.write("i am Iron man");
        Buffer.close();
        System.out.println("Test is completed");
        FileReaderin read=new FileReaderin();
        read.display();
    }
}
