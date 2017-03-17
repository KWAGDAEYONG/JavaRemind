package multiThread.threadGroup;


import multiThread.demonThread.DemonThread;

import java.util.Map;
import java.util.Set;

/**
 * Created by user on 2017-03-17.
 */
public class GetThreadInfo {
    public static void main(String[]args){
        DemonThread demonThread = new DemonThread();
        demonThread.setName("DemonThread");
        demonThread.setDaemon(true);
        demonThread.start();

        Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
        Set<Thread> threads = map.keySet();
        for(Thread thread : threads){
            System.out.println("Name: "+thread.getName()+((thread.isDaemon())?"(데몬)":"(주)"));
            System.out.println("\t" + "소속그룹: "+ thread.getThreadGroup().getName());
            System.out.println();
        }
    }
}
