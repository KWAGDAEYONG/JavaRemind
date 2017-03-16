package multiThread.multiThreadExample;

import java.awt.*;

/**
 * Created by user on 2017-03-16.
 */
//멀티스레드 사용 - 프린팅과 비프음이 동시에 나옴
//익명객체를 사용하는 방법, Runable 인터페이스를 implements 한 클래스에서 run()메소드에 실행할 코드를 작성하여
//Thread객체에 인자값으로 넘겨서 thread.start()메소드를 호출하는 방법 두가지.
public class BeepPrintExample2 {
    public static void main(String []args){
        /*Runnable beepTask = new BeepTask();
        Thread thread = new Thread(beepTask);
        thread.start();*/

        Thread thread = new Thread(new Runnable() {

            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for(int i = 0; i<5; i++){
                    toolkit.beep();
                    try{
                        Thread.sleep(500);
                    }catch (Exception e){}
                }
            }
        });
        thread.start();


        for(int i =0; i<5; i++){
            System.out.println("띵");
            try{
                Thread.sleep(500);
            }catch (Exception e){}
        }
    }
}
