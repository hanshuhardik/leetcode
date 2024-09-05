import java.util.Scanner;
import java.util.*;
public class ParitySort {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
   ArrayList<Integer> ar=new ArrayList<Integer>();
   ArrayList<Integer> ar1=new ArrayList<Integer>();

    for(int j=0;j<n;j++){
        int n1=sc.nextInt();

        for(int k=0;k<n1;k++){
            int a=sc.nextInt();
            ar.add(a);
            ar1.add(a);

        }
        Collections.sort(ar1);
//        System.out.println(ar1);

        int t=0;
        for(int i=0;i<n1;i++){
            if(ar.get(i)%2==0 && ar1.get(i)%2!=0){
                t=1;
//                System.out.println(ar.get(i)+" "+ar1.get(i));
            break;}
            else if (ar.get(i)%2!=0 && ar1.get(i)%2==0) {
                t=1;
//                System.out.println(ar.get(i)+" "+ar1.get(i));
                break;
            }
            else {
                t=0;}


        }
        ar.clear();
        ar1.clear();
        if(t==1)
            System.out.println("No");
        else
            System.out.println("Yes");
        t=0;

    }
    }
}
