package JavaIO.DataIOStream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx {
    private static String file="C:\\Users\\elcot\\Desktop\\javaProjects\\ioexaplefils\\DataIOStream.txt";
    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileOutputStream fout=new FileOutputStream(file);
        DataOutputStream dout=new DataOutputStream(fout);
        dout.writeInt(70);
        dout.writeBoolean(Boolean.TRUE);
        dout.writeChar('R');
        dout.writeDouble(102.00);
        dout.writeLong(243507480);
        dout.close();
        fout.close();
        System.out.println("Tested completed");
    }
}
