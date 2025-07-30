package staticExample;

public class StaticBlock {

    static int a=4;
    static int b=5;

    static{
        System.out.println("I am in static block");
        b=b*5;
    }

    public static void main(String[] args) {
        StaticBlock obj=new StaticBlock();
        System.out.println(obj.a+" "+obj.b);
    }
}
