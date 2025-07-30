package staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static Long population=0L;

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        population+=1;
    }

    public Human() {

    }

    void greeting(){
        System.out.println("Hello world");
        func();// static in non-static method
    }

    static void func(){
        Human random=new Human();
     random.greeting();
     //greeting(); static does not accept the non-static method inorder to use that we have to create the object inside that method
    }
}
