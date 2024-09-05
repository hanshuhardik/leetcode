import java.util.*;
class Solution {
// 1 2 3 4 5 6 7 8 9
static long inversionCount(long arr[], long N)
{
    // Your Code Here
    long[] n;
    n=arr;

    System.out.println(Arrays.toString(n));
    Arrays.sort(n);long f=0;
    System.out.println(Arrays.toString(n));
    for(int i=0;i<N;i++){
        System.out.println(n[i]+" "+arr[i]);
        if(n[i]!=arr[i]){
            f++;
        }
    }
    System.out.println(f);
    return f>0? f-1:f;
}

    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

       long[] nums ={2,4,3,1,5};
               System.out.println(inversionCount(nums, nums.length));
       }
        }

