import java.util.Scanner;

public class InsertionSort {

        static void insert(int arr[],int i)
        {
            // Your code here

        }
        //Function to sort the array using insertion sort algorithm.
        public static void insertionSort(int arr[], int n)
        {
            //code here
            for(int i=1;i<=n-1;i++){
                int j=i;
                while(j>=1 && arr[j]<arr[j-1]){
                    int t=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=t;
                    j--;
                }

            }
            for(int v:arr){
                System.out.print(v+" ");
            }
        }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int ar[]=new int[n];
            for(int i=0;i<n;i++){
                ar[i]=sc.nextInt();
            }
            insertionSort(ar,n);
        }
    }
