package program1;

public class DemoException {
    public static void main(String[] args) {

        int a=5;
        int b=0;

        try{
//            int c=a/b;
//            System.out.println(c);
            divide(a,b);

        }catch (MyException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
            finally {
            System.out.println("Program ends");
        }


    }

    public static int divide(int a, int b) throws Exception{
            if(b==0){
              throw new MyException();
                }


        return a/b;
    }
}
