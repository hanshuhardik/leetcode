import java.util.Scanner;

public class YoungPhysicist {
    public static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int s1=0,s2=0,s3=0;
        for(int i=1;i<=n;i++){
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        s1+=a;
        s2+=b;
        s3+=c;
        }
        if(s1==0&&s2==0&&s3==0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
