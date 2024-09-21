import java.util.*;
public class mergetwosortedarrays {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int arr1[]=new int[a];
        int arr2[]=new int[b];
        for(int i=0;i<a;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<b;i++){
            arr2[i]=sc.nextInt();
        }
        System.err.println(Arrays.toString(mergetwosortedarrays(arr1,arr2)));
    }
    public static int[] mergetwosortedarrays(int a[],int b[]){
        int n1=a.length;
        int n2=b.length;
        int res[]=new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            if(a[i]<=b[j]){
                res[k]=a[i];
                i++;
                k++;
            }
            else if(a[i]>b[j]){
                res[k]=b[j];
                k++;
                j++;
            }
        }
        while(i<n1){
            res[k]=a[i];
            k++;
            i++;
        }
        while(j<n2){
            res[k]=b[j];
            k++;
            j++;
        }
        return res;
    }
}
