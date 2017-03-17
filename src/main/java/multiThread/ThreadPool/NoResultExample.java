package multiThread.ThreadPool;

import multiThread.threadState.TargetThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by user on 2017-03-17.
 */
public class NoResultExample {
    public static void main(String[]args){
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        System.out.println("작업처리요청");

        Runnable runnable = new Runnable() {
            public void run() {
                int sum = 0;
                for(int i = 0; i<=10; i++){
                    sum+=i;
                }
                System.out.println("결과 : "+sum);
            }
        };

        Future future = executorService.submit(runnable);

        try{
            future.get();
            System.out.println("작업처리완료");
        }catch (Exception e){
            System.out.println("예외발생 : "+e.getMessage());
        }

        executorService.shutdown();
    }
}
