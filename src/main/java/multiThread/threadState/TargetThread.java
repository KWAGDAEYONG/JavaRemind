package multiThread.threadState;

/**
 * Created by user on 2017-03-16.
 */
public class TargetThread extends Thread {
    public void run(){

        //RUNNABLE상태
        for(long i = 0; i<1000000000; i++){}

        //일시정지
        try{
            Thread.sleep(1500);
        }catch (Exception e){

        }

        //다시 RUNNABLE
        for(long i = 0; i<1000000000; i++){}
    }
}
