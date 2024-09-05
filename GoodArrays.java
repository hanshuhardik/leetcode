import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GoodArrays {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++){
        int n=sc.nextInt();
        long max=0,count=0,sum=0;
        for(int j=0;j<n;j++) {
            long a = sc.nextLong();
            if(a==1)
                count++;
            else
                sum+=a-1;


        }
        if(count<=sum && n!=1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    }
}
