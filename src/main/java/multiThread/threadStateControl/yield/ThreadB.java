package multiThread.threadStateControl.yield;

/**
 * Created by user on 2017-03-16.
 */
public class ThreadB extends Thread {
    public boolean stop = false;
    public boolean work = true;

    public void run(){
        while (!stop){
            if(work){
                System.out.println("ThreadB작업");
            }else{
                Thread.yield(); //work 안하면 다른쓰레드로 실행 양보
            }
        }
        System.out.println("ThreadB 종료");
    }
}
