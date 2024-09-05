import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int arr[], int n)
    {
        //code here
        for(int i=n-1;i>0;i--){
            int sd=0;
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;

                    sd=1;
                }

            }
            System.out.println("run"+i);
            if(sd==0)
                break;
        }
        for(int v:arr)
            System.out.print(v+" ");

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        bubbleSort(ar,n);
    }
}
