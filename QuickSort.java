//quick sort
import java.util.*;
public class QuickSort{
    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];//pivot is at high that is at the last index
        int i=low-1;//i starts at index at -1 as i is empty.
        for(int j=low;j<high;j++){//low to high
            if(arr[j]<pivot){//if the element is less than pivot
                i++;//increment
                //swap the number found that is smaller than pivot
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }
        i++;
        //swap the pivot
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return i;
    }
    public static void quicksort(int arr[],int low,int high){
        if(low<high){//if low is less than high
            int pivot=partition(arr,low,high);//call partition and store pivot
            quicksort(arr,low,pivot-1);//sort smaller than pivot
            quicksort(arr,pivot+1,high);//sort greater than pivot
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("enter the elements");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        quicksort(arr, 0, size - 1);
        System.out.println("sorted array");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();

    }
}
