package introduction;

public class Student {

//    public Student(){
//        this.rollno=13;
//        this.name="Kunal";
//        this.marks= 9.7F;
//    }

    final int add(){
        return 2;
    }

    public Student(String name){
        this.name=name;
    }

    Student(){
        this(11,"yash",5);
        //Internally is something like
        //new student(11,"yash",5)
    }
    public Student(int rollno, String name, float marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }



    public Student(Student other){
        this.rollno = other.rollno;
        this.name = other.name;
        this.marks = other.marks;
    }

   int rollno;
  String name="Mownika";
    float marks;


//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }
}
