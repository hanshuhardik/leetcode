import java.util.Scanner;

public class CipherShifer {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();String sum="";

            for(int k=0;k<n;k++){
                char c=s.charAt(k);
                k=s.indexOf(c,k+1);
                sum+=c;
            }
            System.out.println(sum);
        }
    }
}
