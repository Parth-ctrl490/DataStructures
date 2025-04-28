//insertion sort
import java.util.*;
public class insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int size = sc.nextInt();
        System.out.println("enter the element");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

        }
        //element added to array
    for(int i=0;i<size;i++){
       int j=i;
        while(j>0 && arr[j-1]>arr[j]){
            int temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            j--;
        }
    }
        System.out.println("sorted array");
        System.out.println(Arrays.toString(arr));
        sc.close();
    }}
