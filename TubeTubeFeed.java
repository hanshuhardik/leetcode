import java.util.ArrayList;
import java.util.Scanner;

public class TubeTubeFeed {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
    int t1=sc.nextInt();
    for(int i=0;i<t1;i++){
        int n=sc.nextInt();
        int t=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        int inc=-2;
        for(int j=0;j<n;j++){
            a.add(sc.nextInt());
        }
        for(int j=0;j<n;j++){
            b.add(sc.nextInt());
        }
        for(int j=0;j<n;j++){
            if(a.get(j)+j<=t && (inc==-2||b.get(inc)<b.get(j))){
//                System.out.println(a.get(j)+j+"<="+t+" j="+j+" "+b.get(j-1)+"<"+b.get(j));
                inc=j;}
        }



        System.out.println(inc+1);

    }
    }
}
