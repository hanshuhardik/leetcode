import java.math.BigInteger;
import java.util.Scanner;

public class SuminBinaryTree {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++){
           long a=sc.nextLong();
            long sum=0;
            while(a>=1){
                sum+=a;
                a=a/2;

            }
            System.out.println(sum);
        }
    }
}
