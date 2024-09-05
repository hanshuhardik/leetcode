import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RestoretheWeather {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            ArrayList<Integer> a=new ArrayList<>();
            ArrayList<Integer> b=new ArrayList<>();
            ArrayList<Integer> ac=new ArrayList<>();

            for(int j=0;j<n;j++){
                int a1=sc.nextInt();
                a.add(a1);
                ac.add(a1);
            }

            for(int j=0;j<n;j++){
                b.add(sc.nextInt());

            }
            Collections.sort(ac);Collections.sort(b);

            for(int j=0;j<a.size();j++){
                int p=ac.indexOf(a.get(j));
                System.out.print(b.get(p)+" ");
                b.remove(p);
                ac.remove(p);
            }
            System.out.println();
        }
    }
}
