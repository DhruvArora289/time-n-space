import java.util.*;
public class quicksort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        quicksort(arr,0,n-1);
    }
    public static void quicksort(int[] arr,int lo,int hi){
        if(lo>hi){
            return;
        }
        int pivot=arr[hi];
        int pidx=partition(arr, pivot, hi, lo);
        quicksort(arr, lo, pidx-1);
        quicksort(arr, pidx+1, hi);
        System.out.println(Arrays.toString(arr));
    }
    public static int partition(int[] arr,int pivot,int hi,int lo){
        int i=lo,j=lo;
        while(i<=hi){
            if(arr[i]<=pivot){
                swap(arr,i,j);
                i++;
                j++;
            }else{
                i++;
            }
        }
        return j-1;
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
