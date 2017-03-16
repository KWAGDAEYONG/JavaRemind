package multiThread.threadStateControl.yield;

/**
 * Created by user on 2017-03-16.
 */
public class Yield {
    public static void main(String[]args){
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();

        threadA.start();
        threadB.start();

        try{
            ThreadA.sleep(3000);
        }catch (Exception e){

        }
        threadA.work = false;

        try{
            ThreadA.sleep(3000);
        }catch (Exception e){

        }
        threadA.work = true;

        try{
            Thread.sleep(3000);
        }catch (Exception e){

        }
        threadA.stop = true;
        threadB.stop = true;
    }
}
