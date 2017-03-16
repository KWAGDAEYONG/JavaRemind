package multiThread.multiThreadWarning;

/**
 * Created by user on 2017-03-16.
 */
public class Calculator {

    private int memory;

    public int getMemory(){
        return memory;
    }
    //동기화메서드로 선언 한경우와 아닌경우의 결과비교
    public void setMemory(int memory){
        this.memory = memory;
        try{
            Thread.sleep(2000);
        }catch (Exception e){}
        System.out.println(Thread.currentThread().getName()+":"+this.memory);
    }
}
