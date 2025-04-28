//selection sort
import java.util.*;
public class selection {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int size=sc.nextInt();
        System.out.println("enter the element");
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();

        }
        //element added to array
        for(int i=0;i<size-1;i++){
            int minIndex=i;
for(int j=i+1;j<size;j++){
    if(arr[j]<arr[minIndex]){
        minIndex=j;
    }
}
//swap the number
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;

        }

System.out.println("sorted array");
        System.out.println(Arrays.toString(arr));
    sc.close();
    }
}
