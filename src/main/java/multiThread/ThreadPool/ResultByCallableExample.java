package multiThread.ThreadPool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by user on 2017-03-17.
 */
public class ResultByCallableExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        System.out.println("작업처리요청");
        Callable<Integer> task = new Callable<Integer>() {
            public Integer call() throws Exception {
                int sum = 0;
                for (int i = 0; i <= 10; i++) {
                    sum += i;
                }
                return sum;
            }
        };
        Future<Integer> future = executorService.submit(task);
        try {

            System.out.println("처리결과:" + future.get());
            System.out.println("작업처리완료");
        } catch (Exception e) {
            System.out.println("예외발생:" + e.getMessage());
        }
        executorService.shutdown();
    }

}
