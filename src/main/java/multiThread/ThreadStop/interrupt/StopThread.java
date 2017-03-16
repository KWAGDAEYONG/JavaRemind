package multiThread.ThreadStop.interrupt;

/**
 * Created by user on 2017-03-16.
 */
public class StopThread extends Thread {

    @Override
    public void run(){
        try{
            while (true){
                System.out.println("실행중");
                if(isInterrupted()){
                    break;
                }
            }
        }catch (Exception e){

        }
        System.out.println("자원 정리");
        System.out.println("종료");
    }

}
