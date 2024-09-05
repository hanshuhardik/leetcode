import java.util.Scanner;

public class VikaandHerFriends {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int sum=x+y;int res=0;
            for(int j=0;j<k;j++){
                int x1=sc.nextInt();
                int y1=sc.nextInt();
                if((x1+y1)%2==0 && sum%2==0)
                    res=1;
                if((x1+y1)%2!=0 && sum%2!=0)
                    res=1;
            }
            if(res==1)
                System.out.println("no");
            else
                System.out.println("Yes");
        }
    }
}
