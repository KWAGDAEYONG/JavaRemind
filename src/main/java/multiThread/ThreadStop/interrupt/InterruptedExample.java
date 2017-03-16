package multiThread.ThreadStop.interrupt;

/**
 * Created by user on 2017-03-16.
 */
public class InterruptedExample {
    public static void main(String [] args){
        StopThread stopThread = new StopThread();
        stopThread.start();
        try {
            Thread.sleep(1000);
        }catch (Exception e){

        }

        stopThread.interrupt();
        
    }
}
