import java.util.*;
public class Priorityqueue11 {
    public static void main(String[] args){
        Queue<String> obj =new PriorityQueue<>(Collections.reverseOrder());
        obj.offer("A");
        obj.offer("C");
        obj.offer("B");
        obj.offer("D");
        obj.offer("E");
        //System.out.println(obj);
        while(!obj.isEmpty()){
            System.out.println(obj.poll());
        }

    }
}
//priority just arrange elements in queue to ascending order using Collections.reverseOrder()
// you change order to descending.
