import java.util.Scanner;

public class TWins {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
        int s=sc.nextInt();
        int[] a=new int[s+1];
        int sum=0,l=0;int d=0;
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
            int i1=i;
            while(i1>0){
                  if(a[i1]>a[i1-1]){
                      int t=a[i1];
                              a[i1]=a[i1-1];
                                a[i1-1]=t;
                                i1--;
                  }
                  else
                      break;

                }



        }
        sum=sum/2;int n=0;
        int demo=0;
        while(n<s){
            demo+=a[n];
            if (sum < demo) {
                System.out.println(n+1);
                break;
            }
            n++;

        }




    }
}
