package program1;

public class swap {
    static Integer a =10;
    static  Integer b=20;
    public static void main(String[] args) {

      swap(a,b);

        System.out.println(a);
        System.out.println(b);
    }

     static void swap(Integer a1, Integer b1) {
        Integer temp = a;
        a = b;
        b = temp;
        

    }

}
