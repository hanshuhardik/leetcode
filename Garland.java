import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class Garland {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
    for(int i=0;i<t;i++){
        String s=sc.nextLine();
        ArrayList<Integer> r=new ArrayList<>();
        for(int j=0;j<4;j++){
            int c=(int)s.charAt(j);
            r.add(c);
        }
//        System.out.println(r);
        int max=0;
        for(int k=0;k<4;k++){
            if(max<Collections.frequency(r,r.get(k)) )
                max=Collections.frequency(r,r.get(k));
        }
        if(max==1 || max==2)
            System.out.println("4");
        else if ( max==3) {
            System.out.println("6");
        }
        else
            System.out.println("-1");
    }
    }
}
