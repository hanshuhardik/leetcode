import java.util.ArrayList;
import java.util.Scanner;

public class GrabtheCandies {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();int ev=0;int od=0;
            for(int j=0;j<n;j++){
                int a=sc.nextInt();
                if(a%2==0)
                    ev+=a;
                else
                    od+=a;
            }
            if(ev>od){
                System.out.println("Yes");
            }
            else
                System.out.println("No");
        }
    }
}
