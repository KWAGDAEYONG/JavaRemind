package multiThread.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by user on 2017-03-17.
 */
public class ExecuteExample {
    public static void main(String[]args) throws Exception{
        final ExecutorService executorService = Executors.newFixedThreadPool(2);

        for(int i = 0; i<10; i++){
            Runnable runnable = new Runnable() {

                public void run() {
                    ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor)executorService;
                    int poolSize = threadPoolExecutor.getPoolSize();
                    String threadName = Thread.currentThread().getName();
                    System.out.println("총 스레드 수: "+poolSize+" 작업 스레드 이름: "+threadName);
                    int value = Integer.parseInt("삼");
                }
            };

            //executorService.execute(runnable);
            executorService.submit(runnable);

            Thread.sleep(10);
        }
        executorService.shutdown();
    }
}
