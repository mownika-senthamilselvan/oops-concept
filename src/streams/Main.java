package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Consumer<String> printer=str-> System.out.println("Hello"+str);
        printer.accept("Mownika");

        List<Employee> employees=EmployeeDataBase.getAllEmployees();

//        for(Employee e:employees){
//            System.out.println(e.getName()+" "+e.getDept());
//        }

        employees.forEach(e-> System.out.println(e.getName()));
    }
}
