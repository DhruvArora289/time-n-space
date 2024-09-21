import java.util.*;
public class sortdates {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sortdates(arr);
    }
    public static void sortdates(int[] arr){
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
        countsort(arr,1000000,100,32);   //days
        countsort(arr,10000,100,13);   //months
        countsort(arr,1,10000,10000);       //years
        print(arr);
    }
    public static void countsort(int[] arr,int div,int mod,int range){
        int[] freq=new int[range];
        for(int val:arr){
            freq[(val/div)%mod]++;
        }

        for(int i=1;i<range;i++){
            freq[i]+=freq[i-1];
        }
        int res[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int val=arr[i];
            int pos=(val/div)%mod;
            int place=freq[pos];
            res[place-1]=val;
            freq[pos]--;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=res[i];
        }
        // print(arr);
    }
    public static void print(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
}
