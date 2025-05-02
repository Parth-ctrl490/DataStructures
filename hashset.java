//Hashset
import java.util.HashSet;
import java.util.Iterator;

public class Hashing{
    public static void main(String[] args){
        HashSet<Integer> set=new HashSet<>();
        //insert(using add keyword
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        //size
        System.out.println(set);//[1, 2, 3]
        System.out.println("size is="+set.size());//3
        //search
        if(set.contains(1)){
            System.out.println("contains");
        }
        if(!set.contains(6)){
            System.out.println("not contains");
        }
        //delete
        set.remove(1);
        if(!set.contains(1)) {
            System.out.println("not contains");
        }
        //iterator
        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());//2
                                         // 3
        }
    }
}
//NOTE-values in iterator can be unsorted
//hashset does not allow any repeated numbers
