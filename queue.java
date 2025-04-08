import java.util.Queue;
import java.util.LinkedList;
public class Queue11 {
    public static void main(String[]  args){
        Queue<String> obj= new LinkedList<String>();
        obj.offer("Parth");//1//acts like push
        obj.offer("Nikhil");//2
        obj.offer("Sirjan");//3
        obj.offer("Roshni");//4
        obj.offer("Kunal");//5
        System.out.println(obj.peek());//Checks for first person ie Parth
        System.out.println(obj);
        System.out.println(obj.contains("Parth"));//seraches for element and returns true and false

        obj.poll();//acts like pop
        obj.poll();
        obj.poll();
        obj.poll();
      //  System.out.println(obj);
    }
}
