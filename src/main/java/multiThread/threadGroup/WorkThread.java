package multiThread.threadGroup;

/**
 * Created by user on 2017-03-17.
 */
public class WorkThread extends Thread {
    public WorkThread(ThreadGroup threadGroup, String threadName) {
        super(threadGroup, threadName);
    }

    @Override
    public void run() {
        while (true) {
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(getName()+" interrupted");
                break;
            }
        }
        System.out.println(getName()+" 종료됨");
    }
}
