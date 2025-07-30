package abstractDemo;

public abstract class Parent {
    String name;

    public Parent(String name) {
        this.name = name;
    }

    void greeting(){
        System.out.println("Hello Everyone");
    }

    static void hello(){
        System.out.println("Hey");
    }

    abstract void career();
    abstract void partner(String name,int age);
}
