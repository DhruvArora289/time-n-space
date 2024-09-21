import java.util.*;
public class radixsort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        radixsort(arr);
}
    public static void radixsort(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int val:arr){
            if(val>max){
                max=val;
            }
        }
        int count=0;
        while(max!=0){
            count++;
            max=max/10;
        }
        int exp=1;
        while(count!=0){
            countsort(arr,exp);
            count--;
            exp=exp*10;
        }
    }
    public static void countsort(int arr[],int exp){
        int freq[]=new int[10];
        for(int val:arr){
            freq[(val/exp)%10]++;
        }
        for(int i=1;i<10;i++){
            freq[i]+=freq[i-1];
        }
        int res[]=new int[arr.length];
        for(int idx=arr.length-1;idx>=0;idx--){
            int val=arr[idx];
            int pos=(val/exp)%10;
            int place=freq[pos];
            res[place-1]=val;
            freq[pos]--;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=res[i];
        }
        print(arr);
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
    }
    System.out.println();
    }
}

