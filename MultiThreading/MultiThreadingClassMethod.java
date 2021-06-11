package MultiThreading;

import java.lang.Thread;

public class MultiThreadingClassMethod {
    public static void main(String[] args){
        // create in instence;
        NumaricThread numaricThread=new NumaricThread();
        AlphaThread alphaThread=new AlphaThread();

        //Thread Started;
        numaricThread.start();
        alphaThread.start();

        //Get the state of the Thread
        System.out.println("Numaric thread get the state= "+numaricThread.getState() );
        System.out.println("Alpha thread get the state= "+alphaThread.getState());

        //getPrioaty
        System.out.println("Numaric thread get the priority= "+numaricThread.getPriority());
        System.out.println("Alpha thread get the priority= "+alphaThread.getPriority());

        //getName
        System.out.println("Numaric thread get Name= "+numaricThread.getName());
        System.out.println("Alpha thread get Name= "+alphaThread.getName());

        //setName
        numaricThread.setName("NumaeriThreradSetName");
        alphaThread.setName("AlphaThreadSetName");
        System.out.println("Numaric thread set Name= "+numaricThread.getName());
        System.out.println("Alpha thread set Name= "+alphaThread.getName());

        //currentThread
        System.out.println("currentThreadName= "+Thread.currentThread().getName());

        //getId
        System.out.println("Numaric thread id= "+numaricThread.getId());
        System.out.println("Alpha thread id= "+alphaThread.getId());

        //isAlive
        if(numaricThread.isAlive()){
            System.out.println("numaric Thread is alive");
        }else{
            System.out.println("numaric Thread is not alive");
        }
        if(alphaThread.isAlive()){
            System.out.println("alpha Thread is alive");
        }else{
            System.out.println("alpha thread is not alive");
        }
    }
}
