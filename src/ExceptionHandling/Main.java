package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=0;


       try{
         //  int c=a/b;
           divide(2,0);
           String name="Mownika";
           if(name.equals("mownika")){
               throw new MyException("name is kunal");
           }
       }catch (ArithmeticException e){
           System.out.println(e.getMessage());
       }catch (Exception e){
           System.out.println("normal exception");
       }finally{
           System.out.println("this will executed");
       }

        int sum=10+20;
        System.out.println(sum);
    }

    static int divide(int a,int b) throws Exception{
        if(b==0){
            throw new ArithmeticException();
        }
        return a/b;
    }
}
