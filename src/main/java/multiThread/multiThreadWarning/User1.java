package multiThread.multiThreadWarning;

/**
 * Created by user on 2017-03-16.
 */
public class User1 extends Thread {
    private Calculator calculator;

    public void setCalculator(Calculator calculator){
        this.setName("User1");
        this.calculator = calculator;
    }

    public void run(){
        calculator.setMemory(100);
    }
}
