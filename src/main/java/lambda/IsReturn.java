package lambda;

/**
 * Created by user on 2017-03-21.
 */
public class IsReturn {
    public static void main(String [] args){
        MyfunctionInterface3 fi;

        fi = (a,b) -> {
            int result = a + b;
            return result;
        };
        System.out.println(fi.method(2,3));

        fi=(a,b)->{
            return a+b;
        };
        System.out.println(fi.method(2,3));

        fi=(a,b)-> a+b;
        System.out.println(fi.method(2,3));
    }

    @FunctionalInterface
    public interface MyfunctionInterface3{
        public int method(int a, int b);
    }
}



