package multiThread.threadStateControl.wait_notify_nofifyAll;

/**
 * Created by user on 2017-03-16.
 */
public class ThreadB extends Thread {
    private WorkObject workObject;

    public ThreadB(WorkObject workObject){
        this.workObject = workObject;

    }

    @Override
    public void run(){
        for(int i=0;i<10;i++){
            workObject.methodB();
        }
    }

}
