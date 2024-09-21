import java.util.*;
public class mergesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int ans[]=mergesort(arr,0,n-1);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] mergesort(int arr[],int lo,int hi){
        if(lo==hi){
            return new int[]{arr[lo]};
        }
        int mid=(lo+hi)/2;
        int lpart[]=mergesort(arr,lo,mid);
        int rpart[]=mergesort(arr,mid+1,hi);
        return mergetwosortedarrays(lpart,rpart);
    }
    public static int[] mergetwosortedarrays(int[] lpart,int[] rpart){
        int i=0,j=0,k=0;
        int n1=lpart.length;
        int n2=rpart.length;
        int res[]=new int[n1+n2];
        while(i<n1 && j<n2){
            if(lpart[i]<=rpart[j]){
                res[k]=lpart[i];
                i++;
                k++;
            }else{
                res[k]=rpart[j];
                j++;
                k++;
            }
        }
        while(i<n1){
            res[k]=lpart[i];
            i++;
            k++;
        }
        while(j<n2){
            res[k]=rpart[j];
            j++;
            k++;
        }
        return res;
    }
}
