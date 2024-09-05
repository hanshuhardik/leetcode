import java.util.Scanner;

public class IanVisitsMary {
    public static long[] lattic(long a,long b){
        long min=0;
        long[] ans=new long[2];
        if(a>=b)
            min=a;
        else
            min=b;

        long c=0,d=0;
        for(int j=2;j<=min;j++){
            if(a%j==0 && b%j==0){
                c=a/j;
                d=b/j;
                break;
            }
    }
        ans[0]=c;
        ans[1]=d+1;

    return ans;
    }
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++){
        long a=sc.nextLong();
        long b=sc.nextLong();
        if(a==1 && b==1){
            System.out.println("1");
            System.out.println("1 1");
        }
        else{
            long c=0,d=0;
                long[] ans=lattic(a,b);
                while(ans[0]!=0 && ans[1]!=0){
//                    System.out.println(ans[0]+" "+ans[1]);
                    c=ans[0];
                    d=ans[1];
                    ans=lattic(ans[0],ans[1]);
                }
                if(c!=0 && d!=0){
                    System.out.println("2");
                    System.out.println(c+" "+d);
                    System.out.println(a+" "+b);
                }
                else{
                    System.out.println("1");
                    System.out.println(a+" "+b);
                }

            }

//                System.out.println(a+" "+b);
            }
        }
    }


