package collection;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<>() ;
        q.poll();
        System.out.println(q.poll());



    }
}
