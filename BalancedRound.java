import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BalancedRound {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            ArrayList<Integer> ar=new ArrayList<>();
            for(int j=0;j<n;j++){
                ar.add(sc.nextInt());
            }
            Collections.sort(ar, Collections.reverseOrder());int max=1;int inc=1;
                for(int l=0;l<n-1;l++){
//                    System.out.println(ar.get(l)+"-"+ar.get(l+1)+"<="+k);
                    if(ar.get(l)-ar.get(l+1)<=k){
                        inc++;
//                        System.out.println("inc"+inc);
                    }
                    else{
//                        System.out.println("break");
                        inc=1;
                }
                    if(max<inc){
                        max=inc;
                    }


                }

            System.out.println(n-max);
        }
    }
}
