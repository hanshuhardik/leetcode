import java.util.Scanner;

public class VanyaandFence {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int h=sc.nextInt();int s=0;
        for(int i=1;i<=n;i++){
            int a=sc.nextInt();
            if(a>h)
                s=s+2;
            else
                s=s+1;
        }
        System.out.println(s);
    }
}
