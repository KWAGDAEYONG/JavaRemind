package multiThread.multiThreadExample;

import java.awt.*;

/**
 * Created by user on 2017-03-16.
 */
public class BeepTask implements Runnable{

    @Override
    public void run(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i=0; i<5; i++){
            toolkit.beep();
            try {
                Thread.sleep(500);
            }catch (Exception e){}
        }
    }
}
