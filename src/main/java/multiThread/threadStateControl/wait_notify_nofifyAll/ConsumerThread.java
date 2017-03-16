package multiThread.threadStateControl.wait_notify_nofifyAll;

/**
 * Created by user on 2017-03-16.
 */
public class ConsumerThread extends Thread {
    private DataBox dataBox;

    public ConsumerThread(DataBox dataBox){
        this.dataBox = dataBox;
    }

    @Override
    public void run(){
        for(int i = 0; i<=3; i++){
            String data = dataBox.getData();
        }
    }

}
