package lambda;

/**
 * Created by user on 2017-03-21.
 */
public class LocalVariable {
    void method(int a){
        int local = 40;

        Func fi = ()->{
            System.out.println("a:"+a);
            System.out.println("local:"+local);
        };
        fi.method();
    }

    public interface Func{
        public void method();
    }

    public static void main(String[]args){
        LocalVariable lv = new LocalVariable();
        lv.method(10);
    }
}
