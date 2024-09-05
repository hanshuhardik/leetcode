import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class VladBuildingBeautifulArray {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++){
        ArrayList<Integer> ar=new ArrayList<>();int e=0;int o=0;
        int n=sc.nextInt();
        for(int j=0;j<n;j++){
            int a=sc.nextInt();
            ar.add(a);
            if(a%2==0)
                e++;
            else
                o++;

        }
        if(e==n||o==n){
            System.out.println("Yes");
        }
        else{
            Collections.sort(ar);
            if(ar.get(0)%2!=0){
                System.out.println("Yes");
            }
            else
                System.out.println("No");
        }
    }
    }
}
