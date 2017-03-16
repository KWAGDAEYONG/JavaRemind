package multiThread.threadState;

/**
 * Created by user on 2017-03-16.
 */
public class ThreadStateExample {
    public static void main(String[]args){
        StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());

        statePrintThread.start();
    }
}
