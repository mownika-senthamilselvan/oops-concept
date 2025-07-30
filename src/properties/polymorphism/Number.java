package properties.polymorphism;

public class Number {
    int sum(int a,int b){
        return a+b;
    }

    int sum(int a,int b,int c){
        return a+b+c;
    }

    double sum(double a,double b){
        return a+b;
    }

    public static void main(String[] args) {
        Number obj=new Number();
        obj.sum(1,2);
        obj.sum(1,2,3);

        //obj.sum(0.1,0.2); // error -- java determines it at compile time

        obj.sum(0.1,0.1);
        obj.sum(1,1);// java automatically converts it(upcasting) lower(int) to higher(double)
    }
}

