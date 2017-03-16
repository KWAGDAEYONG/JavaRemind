package multiThread.multiThreadExample;

import java.awt.*;

/**
 * Created by user on 2017-03-16.
 */

//메인스레드만 이용하는 경우 - 비프음5회 이후 프린팅 발생
public class BeepPrintExample1 {
    public static void main(String[]args){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i =0; i<5; i++){
            toolkit.beep();
            try{
                Thread.sleep(500);
            } catch (Exception e){}
        }

        for (int i = 0; i<5; i++){
            System.out.println("띵");
            try{
                Thread.sleep(500);
            }catch (Exception e){}
        }
    }
}
