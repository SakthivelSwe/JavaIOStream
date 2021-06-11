package MultiThreading;
import java.lang.Thread;

public class NumaricThread extends Thread {
    public static int counter=0;

    @Override
    public void run(){
        for(int i=0;i<10;i++){
            counter=counter+1;
            System.out.println(counter);

        }
    }
}
