package staticExample;

public class InnerClass {
    //Here we use static infront of test because test class is dependent on the innerclass
    static class Test{
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
//        InnerClass ran=new InnerClass(); // without static have to create the object of the two class
//        InnerClass.Test a=ran.new Test("Math");
//        InnerClass.Test b=ran.new Test("rahul");

        Test a1=new Test("Math");
        Test b1=new Test("social");
    }
}
