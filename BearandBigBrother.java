import java.util.Scanner;
public class BearandBigBrother {
    public static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();int t=0;
        while(n<=m){
            n*=3;
            m*=2;
            t++;

        }
        System.out.println(t);
    }
}
