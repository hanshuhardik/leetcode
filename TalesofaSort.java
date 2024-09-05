import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class TalesofaSort {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> ar=new ArrayList<>();
        ArrayList<Integer> ar1=new ArrayList<>();
        for(int i=0;i<n;i++){
            int n1=sc.nextInt();
            for(int j=0;j<n1;j++){
                int a=sc.nextInt();
                ar.add(a);
                ar1.add(a);
            }
            Collections.sort(ar1);
            int t=0;
//            System.out.println(ar1.size());
            for(int k=(ar1.size()-1);k>=0;k--){
             if(ar.get(k)!=ar1.get(k)){
                 t=ar1.get(k);
                 break;
             }
            }
            if(t!=0)
                System.out.println(t);
            else
                System.out.println("0");
            ar.clear();ar1.clear();t=0;
        }
    }}