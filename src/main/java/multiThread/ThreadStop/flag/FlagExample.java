package multiThread.ThreadStop.flag;

/**
 * Created by user on 2017-03-16.
 */
public class FlagExample {
    public static void main(String[]args){
        stopThread stopThread = new stopThread();
        stopThread.start();
        try{
            Thread.sleep(1000);
        }catch (Exception e){

        }
        stopThread.setStop(true);
    }
}
