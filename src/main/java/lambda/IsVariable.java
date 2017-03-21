package lambda;

/**
 * Created by user on 2017-03-21.
 */
public class IsVariable {
        public static void main(String [] args){
            MyFunctionInterface2 fi;

            fi = (a)->{
                int result = a * 5;
                System.out.println(result);
            };
            fi.method(2);

            fi = (a)->{
                System.out.println(a*5);
            };
            fi.method(2);

            fi = (a)-> System.out.println(a*5);

            fi.method(2);
        }


    @FunctionalInterface
    public interface MyFunctionInterface2 {
        public void method(int a);
    }
}
