package abstractDemo;

public class Son extends Parent{
    int age;

    public Son(String name) {
        super(name);
    }



    @Override
    void career() {
        System.out.println("I am a doctor");
    }

    @Override
    void partner(String name, int age) {

    }
}
