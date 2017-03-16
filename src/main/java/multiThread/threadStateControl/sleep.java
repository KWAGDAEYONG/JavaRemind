package multiThread.threadStateControl;

import java.awt.*;

/**
 * Created by user on 2017-03-16.
 */
public class sleep {
    public static void main(String [] args){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i = 0; i<5; i++){
            toolkit.beep();
            try{
                Thread.sleep(500);
            }catch (Exception e){

            }
        }
    }
}
