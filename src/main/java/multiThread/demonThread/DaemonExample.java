package multiThread.demonThread;

/**
 * Created by user on 2017-03-17.
 */
public class DaemonExample {
    public static void main(String[]args){
        DemonThread demonThread = new DemonThread();
        demonThread.setDaemon(true);
        demonThread.start();

        try{
            Thread.sleep(3000);
        }catch (Exception e){

        }
        System.out.println("메인스레드 종료");
    }
}
