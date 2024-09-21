import java.util.*;
public class insertionsort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int arr[]=new int[x];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(insertionsort(arr)));
    }
    public static int[] insertionsort(int arr[]) {
        int n=arr.length;
        for(int itr=1;itr<=n-1;itr++){
            for(int j=itr;j>0;j--){
            if(isGreater(arr,j-1,j)){
                swap(arr,j-1,j);
            }
            else{
                break;
            }
        }
        }
        return arr;
        }
    public static boolean isGreater(int arr[],int i,int j){
        if (arr[i]>arr[j]) {
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
