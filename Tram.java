import java.util.Scanner;

public class Tram {
    public static void main(String ARGS[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int s=0;int t=0;
        for(int i=1;i<=n;i++){
            int a= sc.nextInt();
            int b=sc.nextInt();
            s=s-a+b;
            if(t<s)
                t=s;
        }
        System.out.println(t);
    }
}
