import java.util.Scanner;

public class bunlove {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();long sum=0;
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            for(int j=2;j<n-1;j++){
                sum=sum+(j*2);
            }
            System.out.println(sum);sum=0;
        }
    }
}
