import java.util.*;
public class selectionsort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int arr[]=new int[x];
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(selectionsort(arr)));
    }
    public static int[] selectionsort(int arr[]){
        int n=arr.length;
        for(int itr=1;itr<=n-1;itr++){
            int minidx=itr-1;
            for(int j=itr;j<n;j++){
                if(isSmaller(arr,j,minidx)){
                    minidx=j;
                }
            }
            swap(arr,itr-1,minidx);
        }
        return arr;

    }
    public static boolean isSmaller(int arr[],int i,int j){
        if (arr[i]<arr[j]) {
            return true;
        }else{
            return false;
        }
    }
    public static void swap(int arr[],int i,int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
