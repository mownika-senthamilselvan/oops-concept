package collection;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        //not maintain orset-stores only unique value,der,not access by index

//HashSet- fast and unsorted,unique elements
        HashSet<Integer> set=new HashSet<>();

        //TreeSet- slower compared to hashset(due sorted order),unique elements,sorted
        TreeSet<Integer> tree=new TreeSet<>();

        //LinkedHashSet-Maintain order, unique elements,when you want a set that does not allow duplicates
        // and keeps the original insertion order. Slower campared to hashset (maintain order)

        LinkedHashSet<Integer> set1=new LinkedHashSet<>();
    }
}
