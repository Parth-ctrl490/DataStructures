import java.util.Hashtable;
public class HashTable {
    public static void main(String[] args){
    Hashtable<String,Integer> table=new Hashtable<>();
    //add key and value
    table.put("apple",5);
    table.put("banana",10);
    table.put("guava",7);
    //retrieve value
        System.out.println(table.get("apple"));
        //remove a key
        table.remove("banana");
        System.out.println(table);
        //searching
        if (table.containsKey("apple")) {

            System.out.println("present");

        }
        for(String key:table.keySet()){
            System.out.println(table.get(key));
        }
}}
