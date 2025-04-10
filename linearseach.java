
public class linearsearch {
    public static void main(String[] args){
        int[] arr={2,3,1,5,7,4,1};//array create
        int index=lsearch(arr,1);//function call
        if(index!=-1){//if element found
            System.out.println("the elemnt is:"+index);//print

        }
        else{
            System.out.println("the elemnt is not found");
        }
    }
    private static int lsearch(int[] arr,int value){//lsearch method
        for(int i=0;i<arr.length;i++){//looping in all methods
            if(arr[i]==value){//if value fount in index return index
                return i;
            }
        }
        return -1;
    }
}
