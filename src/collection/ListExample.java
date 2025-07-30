package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        //List-Allows duplicates,maintain order,acess by index

        //It works the same way, but some developers prefer this style because it gives them more
        // flexibility to change the type later.Only need to change ArrayList<Integer>() to LinkedList if we want
        List<Integer> list=new ArrayList<Integer>();

        List<Integer> list1=new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.addFirst(4);
        list1.addLast(10);

//        for(int i=0;i<list1.size();i++){
//            System.out.println(list1.get(i));
//        }

        Collections.sort(list1);
        for(int l:list1){
            System.out.println(l);
        }


//collecttion is a interface
        //collections is a class that provide sort() etc..



    }
}
//ArrayList-Access data get(index) is faster, inseration and deletion are slower when is filled,less memory
//LinkedList-Access data is slower have to travese the whole linkedlist
//inseration and deletion in the middle is faster,more memory its stores the previous node address itself