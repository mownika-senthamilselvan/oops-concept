package program1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static  void main(String[] args){
        int a=10;
        String binary="";
         while(a>0){
             binary=(a%2)+binary;
             a=a/2;
         }
        // System.out.println(binary);

        System.out.print(Math.random());

         HashMap<Integer,Integer> map=new HashMap<>();
         map.put(1,1);
         map.put(2,1);
         map.put(1,2);

         for(Map.Entry<Integer,Integer> entry: map.entrySet()){
             System.out.println(entry.getKey() +" "+entry.getValue());
         }


    }
}
