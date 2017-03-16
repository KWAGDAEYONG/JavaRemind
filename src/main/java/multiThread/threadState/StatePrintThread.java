package multiThread.threadState;

/**
 * Created by user on 2017-03-16.
 */
public class StatePrintThread extends Thread {

    private Thread targetThread;

    public StatePrintThread(Thread targetThread){
        this.targetThread = targetThread;
    }

    public void run(){
        while (true){
            Thread.State state = targetThread.getState();
            System.out.println("타겟스레드 상태: "+state);

            //실행대기상태로
            if(state == Thread.State.NEW){
                targetThread.start();
            }

            if(state == Thread.State.TERMINATED){
                break;
            }

            try{
                Thread.sleep(500);
            }catch (Exception e){}
        }
    }

}
