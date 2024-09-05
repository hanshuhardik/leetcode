

import java.util.*;
import java.util.Scanner;

public class SashaandArrayColoring {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            for(int j=0;j<n;j++){
                ar.add(sc.nextInt());
            }
            Collections.sort(ar);int li=ar.size()-1;int sum=0;
            for(int j=0;j<ar.size()/2;j++){
                sum=sum+(ar.get(li)-ar.get(j));
//                System.out.println(sum+" "+ar.get(li)+ar.get(j));
                li--;
            }
            System.out.println(sum);ar.clear();
        }
    }
}
