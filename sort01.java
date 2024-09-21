import java.util.*;
public class sort01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sort01(arr);
    }
    public static void sort01(int[] arr){
        int i=0,j=0;

        while(i<arr.length){
            if(arr[i]==1){
                i++;
            }
            else{
                swap(arr,i,j);
                i++;
                j++;
            }
        }
        print(arr);
    }
    public static void swap(int arr[],int i,int j){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
    public static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
