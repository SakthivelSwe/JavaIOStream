package JavaIO;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
    private static String file="C:\\Users\\elcot\\Desktop\\javaProjects\\ioexaplefils\\fileoutputstream.txt";
    private static void writeCharacter(int ascii){
        try{
            FileOutputStream fout=new FileOutputStream(file,Boolean.TRUE);
            fout.write(ascii);
            fout.close();
            System.out.println("Test is completed");
        }catch(IOException e){
            System.out.println(e);
        }

    }
    private static void writeString(String string){
        try{
                    FileOutputStream fout=new FileOutputStream(file,Boolean.TRUE);
//            byte b[]=string.getBytes();
            fout.write(string.getBytes());
            fout.close();
            System.out.println("Test is compleated");

        }catch(IOException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        writeCharacter(70);
        writeString("sunilkumar");
        writeString(",I am the number  playBoy in world");
    }

}
