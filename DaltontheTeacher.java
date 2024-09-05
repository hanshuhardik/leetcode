import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DaltontheTeacher {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> ar=new ArrayList<>();int t=0;
//        ArrayList<Integer> ar1=new ArrayList<>();
        for(int i=0;i<n;i++){
            int n1=sc.nextInt();
            for(int j=1;j<=n1;j++){
                int a=sc.nextInt();
                ar.add(a);
//                ar1.add(a);
                if(a==j){
                    t++;
                }
            }
//            Collections.sort(ar1);


              
              System.out.println((int)Math.ceil((double)t/2));
              t=0;ar.clear();
        }
    }
}
