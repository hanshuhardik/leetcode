import java.util.ArrayList;
import java.util.Scanner;
public class DivisibleArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int sum=0;
            ArrayList<Integer> ar=new ArrayList<>();
            for(int j=1;j<=n;j++) {
                ar.add(j);
                sum+=j;

            }
            if(sum%n==0){
                for(int j=0;j<ar.size();j++){
                    System.out.print(ar.get(j)+" ");
                }
            }
            else{
                int f=n-(sum%n);
                sum=sum+f;
                f=f+ar.get(0);
                ar.remove(0);
                ar.add(0,f);
                if(sum%n==0){
                    for(int j=0;j<ar.size();j++){
                        System.out.print(ar.get(j)+" ");
                    }
                }
            }
        }
    }
}
