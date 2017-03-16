package multiThread.threadStateControl.wait_notify_nofifyAll;

/**
 * Created by user on 2017-03-16.
 */
public class WorkObject {
    public synchronized void methoaA(){
        System.out.println("ThreadA의 methodA작업 실행");
        notify();
        try{
            wait();
        }catch (Exception e){

        }
    }

    public synchronized void methodB(){
        System.out.println("ThreadB의 methodB작업 실행");
        notify();
        try{
            wait();
        }catch (Exception e){

        }
    }


}
