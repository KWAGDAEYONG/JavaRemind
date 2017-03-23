package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by user on 2017-03-23.
 */
public class ParalleExample {
    public static void main(String[]args){
        List<String> list = Arrays.asList("홍길동","김길동","고길동","김개똥","박개똥");

        Stream<String> stream = list.stream();
        stream.forEach(ParalleExample::print);

        System.out.println();

        Stream<String> parall = list.parallelStream();
        parall.forEach(ParalleExample::print);
    }

    public static void print(String str){
        System.out.println(str+" : "+ Thread.currentThread().getName());
    }
}
