import java.util.Scanner;
public class SoldierandBananas {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int w=sc.nextInt();
        int s=0;
        for(int i=1;i<=w;i++){
            s=s+(k*i);
        }
        if(s-n>0)
        System.out.println(s-n);
        else
            System.out.println("0");
    }
}
