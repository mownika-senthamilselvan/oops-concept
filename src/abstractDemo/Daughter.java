package abstractDemo;

public class Daughter extends Parent{


    public Daughter(String name) {
        super(name);
    }

    @Override
    void career() {
        System.out.println("I am software Developer");
    }

    @Override
    void partner(String name, int age) {

    }
}
