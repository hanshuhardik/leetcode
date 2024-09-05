import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TwinPermutations {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++){
        int n=sc.nextInt();
        ArrayList<Integer> ar=new ArrayList<>();
        ArrayList<Integer> ar1=new ArrayList<>();
        ArrayList<Integer> ele=new ArrayList<>();
        for(int j=0;j<n;j++){
            int a=sc.nextInt();
            ar.add(a);
            ar1.add(a);
        }
        Collections.sort(ar1);
        int sum=ar.get(ar.size()-1)+ar1.get(ar1.size()-1);
        ele.add(ar1.get(ar1.size()-1));
        ar1.remove(ar1.size()-1);
        for(int j=n-2;j>=0;j--){
            for(int k=ar1.size()-1;k>=0;k--){
                if(sum>=(ar.get(j)+ar1.get(k))){
                    ele.add(ar1.get(k));
                ar1.remove(ar1.indexOf(ar1.get(k)));
                break;
                }
            }
        }
        for(int k=ele.size()-1;k>=0;k--){
            System.out.print(ele.get(k)+" ");
        }
        System.out.println();
    }
    }
}
