package program1;

public class MyException extends Exception{
    public MyException(){
        System.out.println("This my exception");
    }

    public MyException(String Message){
        System.out.println("This ia my exception"+Message);
    }
}
