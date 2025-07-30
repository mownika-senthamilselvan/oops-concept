package properties;

public class Main {
    public static void main(String[] args) {
        Boxweight box=new Boxweight();
        System.out.println(box.l+" "+box.h+" "+box.w+" "+box.weight);

        Boxweight box1=new Boxweight(1,2,3,4,5);
        System.out.println(box1.l+" "+box1.h+" "+box1.w+" "+box1.weight);

        Box box2=new Boxweight();

    }
}
