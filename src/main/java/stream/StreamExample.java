package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by user on 2017-03-23.
 */
public class StreamExample {
    public static void main(String[]args){
        List<String> list = Arrays.asList("홍길동", "김개똥","김소똥");

        //기존의 방식
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //람다 스트림의 활용
        //Stream<String> stream = list.stream();
        list.stream().forEach(name -> System.out.println(name));
    }
}
