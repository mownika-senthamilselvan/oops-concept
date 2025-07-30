package packages;

public class A {
    protected int num;
    private String name;
    int[] arr;

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

    public static void main(String[] args) {
        A obj =new A(10,"Mownika");
        System.out.println(obj.name);
    }
}
