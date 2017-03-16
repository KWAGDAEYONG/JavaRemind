package multiThread.threadSetPriority;

/**
 * Created by user on 2017-03-16.
 */
public class CalcThread extends Thread {
    public CalcThread(String name){
        setName(name);
    }

    public void run(){
        for(int i = 0; i<2000000000; i++){
        }
        System.out.println(getName());
    }

}
