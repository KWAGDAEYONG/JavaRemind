package multiThread.multiThreadWarning;

/**
 * Created by user on 2017-03-16.
 */
public class MainThreadExample {
    public static void main(String [] args){
        //하나의 객체를 두개의 쓰레드가 공유하는 경우 발생하는 문제
        Calculator calculator = new Calculator();

        User1 user1 = new User1();
        user1.setCalculator(calculator);
        user1.start();

        User2 user2 = new User2();
        user2.setCalculator(calculator);
        user2.start();
    }
}
