package multiThread.threadStateControl.join;

/**
 * Created by user on 2017-03-16.
 */
public class SumThread extends Thread {
    private long sum;

    public long getSum(){
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    public void run(){
        for(int i = 0; i<=100; i++){
            sum+=i;
        }
    }

}
