import java.util.Scanner;

public class TenzingandTsondu {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
     int t=sc.nextInt();
     for(int i=0;i<t;i++){
         int n=sc.nextInt();
         int n1=sc.nextInt();
         long sum1=0;long sum2=0;
         for(int j=0;j<n;j++){
             int a=sc.nextInt();
             sum1+=a;
         }
         for(int j=0;j<n1;j++){
             int a=sc.nextInt();
             sum2+=a;
         }
         if(sum1>sum2){
             System.out.println("Tsondu");
         } else if (sum2>sum1) {
             System.out.println("Tenzing");
         }
         else
             System.out.println("Draw");
     }
    }
}
