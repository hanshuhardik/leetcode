import java.util.Scanner;

public class RudolphandCuttheRope {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++){
        int n=sc.nextInt();int temp=0;
        for(int j=0;j<n;j++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(b<a)
                temp++;
        }
        System.out.println(temp);
    }
    }
}
