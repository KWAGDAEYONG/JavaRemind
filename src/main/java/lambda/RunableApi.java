package lambda;

/**
 * Created by user on 2017-03-21.
 */
public class RunableApi {
    public static void main(String [] args){
        Runnable runnable = () ->{
            for(int i = 0 ; i<10; i++){
                System.out.println(i);
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
