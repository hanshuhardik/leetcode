import java.util.*;
import java.util.Scanner;

public class TheManwhobecameaGod {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int[] ar=new int[0];
        ArrayList<Integer> diff=new ArrayList<>();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            ar=new int[n];

            for(int j=0;j<n;j++){
                ar[j]=sc.nextInt();
                if(j>0){
                    diff.add(Math.abs(ar[j]-ar[j-1]));
                }
            }

                Collections.sort(diff);

            int sum=0;


            for(int j=0;j<diff.size()-(k-1);j++){
                sum+=diff.get(j);
//    System.out.print(diff.get(j));
            }
            System.out.println(sum);
            diff.clear();
        }
    }
}
