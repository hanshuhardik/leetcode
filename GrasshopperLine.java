import java.util.ArrayList;
import java.util.Scanner;

public class GrasshopperLine {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++){
        int n=sc.nextInt();
        int k=sc.nextInt();
        ArrayList<Integer> ar=new ArrayList<>();
        int inc=0;
        int sum=0;
        int n1=n;
        while(sum<n){
            if(n1%k!=0){
                sum+=n1;
                ar.add(n1);
                n1=n-sum;
                if(sum==n)
                    break;
            }
            else{
                if(n1>0){
                    n1--;
                }
            }

        }
        System.out.println(ar.size());
        for(int j=0;j<ar.size();j++){
            System.out.print(ar.get(j)+" ");
        }
        ar.clear();


    }
    }
}
