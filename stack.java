import java.util.Stack;
public class Stack11{
    public static void main(String[] args){
        Stack<String> obj=new Stack<String>();//stack object
      //  System.out.println(obj.empty());
        //push to push objects
        obj.push("lion");//5
        obj.push("tiger");//4
        obj.push("elephant");//3
        obj.push("kangaroo");//2
        obj.push("cat");//1
//pop to remove objects
//      obj.pop();
//      obj.pop();
//      obj.pop();
//        System.out.println(obj);
//        System.out.println(obj.peek());//display the last given element in stack ie no.1
        System.out.println(obj.search("tiger"));//search element in stack ie 4.
    }
}


