import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class KarinaandArray {
 public static void main(String ARGS[]) {
     Scanner sc = new Scanner(System.in);
 int t=sc.nextInt();
 for(int i=0;i<t;i++){
     int n=sc.nextInt();
     ArrayList<Long> ar=new ArrayList<>();
     for(int j=0;j<n;j++){
         long a=sc.nextLong();
        ar.add(a);

     }
     Collections.sort(ar,Collections.reverseOrder());
//     System.out.println(ar);
     long max=ar.get(0)*ar.get(1);
     long max2=ar.get(ar.size()-1)*ar.get(ar.size()-2);
     if(max<max2)
         max=max2;
        System.out.println(max);
 } }
}