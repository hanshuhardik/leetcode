import java.util.*;
class SelectionSort
{
    static int  select(int arr[], int i)
    {
        // code here such that selectionSort() sorts arr[]
        int min=i;
        for(int j=i;j<arr.length;j++){
            if(arr[j]<arr[min])
                min=j;
        }
        return min;

    }

    static void selectionSort(int arr[], int n)
    {
        //code here
        for(int i=0;i<n-1;i++){
            int min=select(arr,i);
            int t=arr[min];
            arr[min]=arr[i];
            arr[i]=t;
        }
        for(int v:arr)
            System.out.print(v+" ");

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        selectionSort(arr,n);
    }
}