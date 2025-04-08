import java.util.*;
public class Linklist11 {
    public static void main(String[] args){
                LinkedList<String> obj=new LinkedList<String>();
//                obj.push("P");
//                obj.push("A");
//                obj.push("R");
//                obj.push("T");
//                obj.push("H");
              //  System.out.println(obj);//[H, T, R, A, P]
//               obj.pop();
//                obj.pop();
//                obj.pop();
      //  System.out.println(obj);//[A, P]
        obj.offer("P");
        obj.offer("A");
        obj.offer("R");
        obj.offer("T");
        obj.offer("H");
//        System.out.println(obj);//[P, A, R, T, H]
        obj.add(0,"A");//[A, P, A, R, T, H]
        obj.remove("A");//[P, A, R, T, H]
        //System.out.println(obj);
        //System.out.println(obj.peekFirst());//P
        //System.out.println(obj.peekLast());//H
       // System.out.println(obj.removeFirst());//A
        System.out.println(obj.removeLast());//H

    }
}
