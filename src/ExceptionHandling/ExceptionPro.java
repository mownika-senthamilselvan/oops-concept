package ExceptionHandling;

public class ExceptionPro {
    public static void main(String[] args) {
        method1();


    }
//Passing exception from one method to its caller
    public static void method1(){
       method2();
    }

    public static void method2(){
method3();
    }

    public static void method3(){
        int a=7/0;
    }
}
//Works only for Unchecked Exceptions (like ArithmeticException, NullPointerException)
