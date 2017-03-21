package lambda;

/**
 * Created by user on 2017-03-21.
 */
public class Example {
    public static void main(String[]args){
        MyFunctionInterface fi;

        fi =() -> {
            String str = "method call1";
            System.out.println(str);
        };
        fi.method();

        fi = () -> {
            System.out.println("method call2");
        };
        fi.method();


        fi=() -> System.out.println("method call3");
        fi.method();
    }

    @FunctionalInterface
    public interface MyFunctionInterface {
        public void method();
    }

}

