//linear search 
//METHOD 1(DIRECT)
// public class linearsearch {
//     public static void main(String[] args){
//         int[] arr={2,3,1,5,7,4,1};//array create
//         int index=lsearch(arr,1);//function call
//         if(index!=-1){//if element found
//             System.out.println("the elemnt is:"+index);//print

//         }
//         else{
//             System.out.println("the elemnt is not found");
//         }
//     }
//     private static int lsearch(int[] arr,int value){//lsearch method
//         for(int i=0;i<arr.length;i++){//looping in all methods
//             if(arr[i]==value){//if value fount in index return index
//                 return i;
//             }
//         }
//         return -1;
//     }
// }


//METHOD2(USER INPUT)
//linear search
import java.util.*;
public class random{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the target");
        int target=sc.nextInt();
        System.out.println("enter the size of array");
        int num = sc.nextInt();
        int[] arr = new int[num];//
        System.out.println("enter the elements of array");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();//fill the elements
        }
          boolean found=false;
        for(int j=0;j<num;j++) {
            if (arr[j] == target) {
                System.out.println("found at " + j);//arr[j]
                found = true;
                break;
            }
            if(!found){
                System.out.println("target no found");
            }
        }
    sc.close();
    }}

