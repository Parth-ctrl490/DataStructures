//method1
//import java.util.Arrays;
//public class binsearch {
//    public static void main(String[] args){
//        int arr[] = new int[100];
//        int target=42;
//        for(int i=0;i<arr.length;i++){
//            arr[i] =i;
//
//        }
//        int index=Arrays.binarySearch(arr,target);
//        if(index ==-1){
//            System.out.println("target not found");
//
//        }
//        else{
//            System.out.println("target found"+target);
//        }
//    }
//
//}
//method2
import java.util.Arrays;
public class binsearch {
    public static void main(String[] args){
        int arr[] = new int[1000];//size of array
        int target=428;//value ti be searched
        for(int i=0;i<arr.length;i++){//looping statement
            arr[i] =i;

        }
        int index=binarySearch(arr,target);//function call
        if(index ==-1){//if index is -1
            System.out.println("target not found");

        }
        else{//else statement
            System.out.println("target found"+target);
        }
    }
    private static int binarySearch(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high - low)/2;//formaula to find middle element
            int value=arr[mid];//value in middle
            if (value < target) {//if current value is less than target

                low=mid+1;
            }
            else if(value>target){//if current value is greater than target
                high=mid -1;
            }
            else return mid;//if current value is at middle

        }
        return -1;//value not found
    }

}
