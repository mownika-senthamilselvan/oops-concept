package collection;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        //Map-stored as keyPair Value, key must be unique

        // HashMap-fast and unsorted,key cannot be duplicated values can be duplicated,
        // key cannot be null values be
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,0);
        map.get(1);

        for(Map.Entry<Integer,Integer> m: map.entrySet()){
            System.out.println( m.getKey());
            System.out.println(m.getValue());
        }


        //TreeMap - sorted by key

        //LinkedHashMap - maintains order
    }
}
