package MultiThreading;
import java.lang.Thread;

public class AlphaThread extends Thread{
    public static char character='A';
    @Override
    public void run(){
        for(int i=0;i<26;i++){
            System.out.println(character);
            character=(char)(character+1);
        }
    }
}
