import java.util.Scanner;

public class mergeSort {
    public static void merge(int arr[],int si,int mid,int ei){
        int x=0;int id1=si;int id2=mid+1;
        int temp[]=new int[ei-si+1];
        while(id1<=mid && id2<=ei ){
            if(arr[id1]<=arr[id2]){
                temp[x++]=arr[id1++];
            }else{
                temp[x++]=arr[id2++];
            }
        }
        while(id1<=mid){
            temp[x++]=arr[id1++];
        }
        while(id2<=ei){
            temp[x++]=arr[id2++];
        }
        for(int i=0,j=si;i<temp.length;i++,j++){
            arr[j]=temp[i];
        }
    }
public static void mergeSort(int arr[],int si,int ei){
    if(si>=ei){
        return;
    }
    int mid=si+(ei-si)/2;
    mergeSort(arr,si,mid);
    mergeSort(arr,mid+1,ei);
    merge(arr,si,mid,ei);
}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        mergeSort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}