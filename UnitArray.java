import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UnitArray {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ar=new ArrayList<>();
     int t=sc.nextInt();
     for(int i=0;i<t;i++){
         int n=sc.nextInt();

         int sum=0;int mul=1;
         for(int j=0;j<n;j++){
             int a=sc.nextInt();
             ar.add(a);
             sum+=a;mul*=a;
         }
         Collections.sort(ar);int inc=0;
//         System.out.println(sum+"s =m"+mul+"     "+ar);
         while(mul==0||mul==-1 || sum<0){
             ar.remove(0);
             ar.add(1);sum=0;mul=1;
             for(int j=0;j<ar.size();j++){
                 sum+=ar.get(j);
                 mul*=ar.get(j);
             }

             inc++;
             Collections.sort(ar);
//             System.out.println(sum+"s =m"+mul+"  inc="+inc+"     "+ar);
         }
         System.out.println(inc);ar.clear();
     }
    }
}
