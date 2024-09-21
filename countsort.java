import java.util.*;
public class countsort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        int max=arr[0];
        for(int val:arr){
            min=Math.min(val, min);
            max=Math.max(val, max);
        }
        System.out.println(Arrays.toString(countsort(arr,max,min)));
    }
    public static int[] countsort(int arr[],int max,int min){
        int range=max-min+1;
        int freq[]=new int[range];
        for(int val:arr){
            int pos=val-min;
            freq[pos]++;
        }
        for(int i=1;i<range;i++){
            freq[i]+=freq[i-1];
        }
        int res[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int val=arr[i];
            int pos=val-min;
            int place=freq[pos];
            res[place-1]=val;
            freq[pos]--;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=res[i];
        }
        return arr;
    }
}
