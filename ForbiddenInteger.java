import java.util.ArrayList;
import java.util.Scanner;

public class ForbiddenInteger {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();

    for(int i=0;i<t;i++) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();
        int sum = 0;
        int inc = 0;
        int x1=x;
        int a=1;
        ArrayList<Integer> ar = new ArrayList<>();
        while(x1>=1){
            while(a<=k){
                if(a!=x){
                    while(sum<n){
                        sum+=a;
                        ar.add(a);
                    }
                }
                a++;
            }
            x1--;
        }
        if(sum==n){
            System.out.println("Yes");
            System.out.println(ar.size());
            for(int j=0;j<ar.size();j++){
                System.out.print(ar.get(j)+" ");
            }
            System.out.println();
        }
        else
            System.out.println("No");

        ar.clear();

    }
    }
}
