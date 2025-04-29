//merge sort
import java.util.*;
public class merge{
    private static void merge(int arr[],int low,int mid,int high){
        int[] temp = new int[high - low + 1];
        int left=low;int right=mid+1;int k=0;
        while(left<=mid && right<=high){
            temp[k++]=(arr[left]<=arr[right])?arr[left++]:arr[right++];

        }
        while(left<=mid)temp[k++]=arr[left++];
        while(right<=high)temp[k++]=arr[right++];
        System.arraycopy(temp,0,arr,low,temp.length);
    }
    private static void mergesort(int[] arr,int low,int high){
        if(low<high){
            int mid=(low+high)/2;
            mergesort(arr,low,mid);
            mergesort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        mergesort(arr,0,n-1);
        System.out.println("sorted array is=");
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
