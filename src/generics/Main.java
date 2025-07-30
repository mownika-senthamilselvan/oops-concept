package generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> arr=new ArrayList<>();
        arr.add("Mownika");

        System.out.println(arr);

        CustomArrayList<String> list=new CustomArrayList();
        list.add("Mownika");
        System.out.println(list);

    }
}
