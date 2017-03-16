package multiThread.threadStateControl.join;

/**
 * Created by user on 2017-03-16.
 */
public class JoinExample {
    public static void main(String [] args){
        SumThread sumThread = new SumThread();

        sumThread.start();

        //이게 없으면, 메인스레드의 출력이 먼저 끝나버려서 연산중에 결과값을 찍어버릴수 있음
        try{
            sumThread.join();
        }catch (Exception e){

        }

        System.out.println("1~100 sum : "+sumThread.getSum());
    }
}
