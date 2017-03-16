package multiThread.multiThreadExample;

import java.awt.*;

/**
 * Created by user on 2017-03-16.
 */
public class BeepPrintExample3 {
    public static void main(String [] args){
        /*Thread thread = new BeepThread();
        */
        Thread thread = new Thread(){
            @Override
            public void run(){
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for(int i = 0; i<5; i++){
                    toolkit.beep();
                    try{
                        Thread.sleep(500);
                    }catch (Exception e){}
                }
            }
        };
        thread.start();

        for(int i = 0 ; i<5; i++){
            System.out.println("띵");
            try{
                Thread.sleep(500);
            }catch (Exception e){}
        }
    }
}
