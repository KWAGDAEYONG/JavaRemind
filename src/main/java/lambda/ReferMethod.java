package lambda;


import java.util.function.IntBinaryOperator;

/**
 * Created by user on 2017-03-21.
 */
public class ReferMethod {
    public static void main(String[]args){
        IntBinaryOperator oper;

        oper =(a,b)->Caculator.staticMethod(a,b);
        System.out.println(oper.applyAsInt(1,2));

        oper = Caculator :: staticMethod;
        System.out.println(oper.applyAsInt(3,4));

        Caculator ca = new Caculator();

        oper = (a,b)->ca.instanceMethod(a,b);
        System.out.println(oper.applyAsInt(5,6));

        oper = ca ::instanceMethod;
        System.out.println(oper.applyAsInt(7,8));
    }

    public static class Caculator{
        public static int staticMethod(int a, int b){
            return a+b;
        }

        public int instanceMethod(int a, int b){
            return a+b;
        }
    }
}
