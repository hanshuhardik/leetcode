import java.util.Scanner;

public class blackboard {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++){
        int n=sc.nextInt();
        long l=0;long h=0;
        for(int j=0;j<n;j++){
            long a=sc.nextLong();
            if(l>=a)
                l=a;
            if(h<a)
                h=a;
        }
        if(l<0)
            System.out.println(l);
        else if(h==l)
            System.out.println(h);
        else
            System.out.println(h);
    }
    }
}
