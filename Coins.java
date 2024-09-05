import java.util.Scanner;

public class Coins {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++){
        long n=sc.nextLong();
        long k=sc.nextLong();
        if(n%2!=0 && k%2==0){
            System.out.println("No");

        }
        else
            System.out.println("yes");
        }
    }
}
