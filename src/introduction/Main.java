package introduction;


public class Main {
    public static void main(String[] args) {

        final int STUDENT_COUNT=30;
        //STUDENT_COUNT=50;

       Student kunal=new Student(); // Default Constructor
       // System.out.println(kunal.rollno);


        Student mow=new Student(23,"mow",8.1F); // Parameterised Constructor
       // System.out.println(mow.rollno);

       Student random=new Student(kunal); //copy constructor
       // System.out.println(random.name);

        Student random2=new Student();
       // System.out.println(random2.name);

        //final keyword
       final Student random3=new Student("Kunal");
       // random3=new Student("yazhan");
        System.out.println(random3.name);
        random3.name="Mithran";
        System.out.println(random3.name);




    }
}