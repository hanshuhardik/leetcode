import java.util.ArrayList;
import java.util.Scanner;

public class MakeItZero {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++){
        int n=sc.nextInt();
        int f=0;
        for(int j=0;j<n;j++){
            int a=sc.nextInt();
            if(a==0)
                f++;
        }
        if(f!=n){
        if(n%2==0){
            System.out.println("2");
            System.out.println(1 +" "+n);
            System.out.println(1 +" "+n);
        }
        else{
            System.out.println("4");
            System.out.println(2 +" "+n);
            System.out.println(2 +" "+n);
            System.out.println("1 2");
            System.out.println("1 2");
        }}
        else
            System.out.println("0");
    }
    }
}
