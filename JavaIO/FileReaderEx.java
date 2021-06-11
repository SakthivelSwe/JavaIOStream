package JavaIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    private static String file="C:\\Users\\elcot\\Desktop\\javaProjects\\ioexaplefils\\byteArray1.txt";
    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileReader fr=new FileReader(file);
        int i=0;
        while((i=fr.read())!=-1){
            System.out.println(i+" equels are= "+(char) i);
        }
        fr.close();
    }
}

