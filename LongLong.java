import java.util.ArrayList;
import java.util.Scanner;

public class LongLong {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();long sum=0;int flag=0;int op=0;int flagc=0;
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            for(int j=0;j<n;j++){
               int a=sc.nextInt();
               sum=sum+Math.abs(a);
               flagc=flag;
               if(a!=0){


               if(a<0){
                   flag=1;
               }
               else {
                   flag=0;
               }}
               if(flagc!=flag && flag>0)
                   op++;

            }
            System.out.println(sum+" "+op);op=0;sum=0;flagc=0;flag=0;
        }
    }
}
