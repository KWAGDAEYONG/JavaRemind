package multiThread.ThreadStop.flag;

/**
 * Created by user on 2017-03-16.
 */
public class stopThread extends Thread{

    private boolean stop;

    public void setStop(boolean stop){
        this.stop = stop;
    }

    @Override
    public void run(){
        while(!stop){
            System.out.println("실행중");
        }
        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }
}
