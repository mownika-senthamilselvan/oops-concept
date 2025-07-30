package staticExample;

public class Main {
    public static void main(String[] args) {
        Human kunal=new Human(19,"kunal",11,true);
        Human rahul=new Human(12,"rahul",12,false);

        System.out.println(kunal.population);
        System.out.println(rahul.population);

        SingletonClass obj=SingletonClass.getInstance();

        SingletonClass obj1=SingletonClass.getInstance();
        // All are refer to the same object

        if(obj==obj1){
            System.out.println("Its singleton");
        }else{
            System.out.println("Its not singleton");
        }

    }
}
