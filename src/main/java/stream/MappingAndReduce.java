package stream;


import java.util.Arrays;
import java.util.List;

/**
 * Created by user on 2017-03-23.
 */
public class MappingAndReduce {
    public static void main(String []args){
        List<Student> studentList = Arrays.asList(
                new Student("홍길동", 10),
                new Student("고길동", 20),
                new Student("김개똥", 30)
        );

        double avg = studentList.stream().mapToInt(Student::getScore).average().getAsDouble();

        System.out.println(avg);
    }

    public static class Student{
        private String name;
        private int score;
        Student(String name, int score){
            this.name = name;
            this.score = score;
        }

        public String getName(){
            return name;
        }

        public int getScore(){
            return score;
        }
    }
}

