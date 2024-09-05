import java.util.Scanner;

public class BunLover {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();long sum=0;
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            long f=n-3;
            long l=(4*(long)n)+3+(n-1);
            sum=f*n+l;
            System.out.println(sum);sum=0;
        }
    }
}
