package multiThread.threadStateControl.wait_notify_nofifyAll;

/**
 * Created by user on 2017-03-16.
 */
public class WaitNotifyExample {
    public static void main(String[]args){
        /*WorkObject sharedObject = new WorkObject();

        ThreadA threadA = new ThreadA(sharedObject);
        ThreadB threadB = new ThreadB(sharedObject);

        threadA.start();
        threadB.start();*/

        DataBox dataBox = new DataBox();

        ProducerThread producerThread = new ProducerThread(dataBox);
        ConsumerThread consumerThread = new ConsumerThread(dataBox);

        producerThread.start();
        consumerThread.start();
    }
}
