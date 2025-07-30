package properties.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.area();
        Triangle triangle=new Triangle();
        triangle.area();

        Shapes square=new Square();
        square.area();

        List<Integer> arr=new ArrayList<>();

    }
}
