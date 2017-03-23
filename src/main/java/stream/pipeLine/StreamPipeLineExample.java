package stream.pipeLine;

import lambda.*;


import java.util.Arrays;
import java.util.List;

/**
 * Created by user on 2017-03-23.
 */
public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", Member.MALE, 30),
                new Member("김나라", Member.FEMALE, 10),
                new Member("신용권", Member.MALE, 20),
                new Member("박수미", Member.FEMALE, 50)
        );

        double ageAvh = list.stream().filter(member -> member.getSex()==Member.MALE).mapToInt(Member::getAge).average().getAsDouble();

        System.out.println("남자 평균 나이:"+ageAvh);
    }
}
