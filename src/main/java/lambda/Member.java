package lambda;

/**
 * Created by user on 2017-03-21.
 */
public class Member {
    public int outterField = 10;

    class Inner{
        int innerField = 20;

        void method(){
            Func fi = () ->{
                System.out.println("of:"+outterField);
                System.out.println("of:"+Member.this.outterField);

                System.out.println("in:"+innerField);
                System.out.println("in:"+this.innerField);
            };
            fi.method();
        }
    }

    public interface Func{
        public void method();
    }

    public static void main(String []args){
        Member m = new Member();
        Member.Inner in = m.new Inner();

        in.method();
    }
}
