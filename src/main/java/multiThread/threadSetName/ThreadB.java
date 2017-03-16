package multiThread.threadSetName;

/**
 * Created by user on 2017-03-16.
 */
public class ThreadB extends Thread {
    public void run(){
        for(int i = 0; i<2; i++){
            System.out.println(getName()+"가 출력한 내용");
        }
    }
}
