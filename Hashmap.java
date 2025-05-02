//Hashmap
//they provide key value pair
//they are also unorderd
import java.util.*;
public class Hashmap {
    public static void main(String[] args){
        HashMap<String,Integer> map=new HashMap<>();
        //insertion
        map.put("India",150);
        map.put("China",200);
        map.put("US",30);
        System.out.println(map);
        //search key
        if(map.containsKey("China")){
            System.out.println("present");
        }
        else{
            System.out.println("not present");
        }
        //value
        System.out.println(map.get("China"));
        //traversal
        int [] arr={12,15,18};
        for(int val:arr){
            System.out.println(val+" ");
        }
        System.out.println();
        //searching
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }
        //remove
        map.remove("China");
        System.out.println(map);
    }
}
