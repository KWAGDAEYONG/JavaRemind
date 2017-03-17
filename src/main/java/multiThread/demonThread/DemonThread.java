package multiThread.demonThread;

/**
 * Created by user on 2017-03-17.
 */
public class DemonThread extends Thread {
    public void save(){
        System.out.println("데몬쓰레드 작업");
    }

    @Override
    public void run(){
        while (true){
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                break;
            }
            save();
        }
    }
}
