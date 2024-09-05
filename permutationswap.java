import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class permutationswap {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            ArrayList<Integer> ar=new ArrayList<>();
            for(int j=1;j<=n;j++){
                int a=sc.nextInt();
                if(Math.abs(a-j)>0 && !ar.contains(Math.abs(a-j)))
                ar.add(Math.abs(a-j));
            }
            int lcd=1;
            Collections.sort(ar);
//            System.out.println(ar);
            for(int j=0;j<ar.size();j++){
                int inc=0;
                for(int k=0;k<ar.size();k++){
                    if(ar.get(k)%ar.get(j)==0){
                        inc++;
                    }
                }
                if(inc==ar.size())
                    lcd=ar.get(j);

            }
            System.out.println(lcd);
            ar.clear();
        }
    }
}
