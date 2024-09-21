import java.util.*;
public class bubblesort{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int arr[]=new int[x];
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(bubblesort(arr)));
    }
    public static int[] bubblesort(int arr[]){
        int n=arr.length;
        for(int itr=1;itr<=n-1;itr++){
            for(int j=0;j<=n-itr-1;j++){
                if(isSmaller(arr,j+1,j)){
                    swap(arr,j+1,j);
                }
            }
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