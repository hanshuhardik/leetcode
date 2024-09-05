import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Destroyer {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            ArrayList<Integer> ar=new ArrayList<>();
            ArrayList<Integer> ar1=new ArrayList<>();

            int inc=0;
            for(int j=0;j<n;j++){
               int a= sc.nextInt();
                ar.add(a);
                if(!ar1.contains(a)){
                    ar1.add(a);
                }
            }
Collections.sort(ar1);
                if(ar1.contains(0)){
            for(int j=1;j<ar1.size();j++){
//                System.out.print(Collections.frequency(ar,ar1.get(j)-1)+" "+(ar1.get(j)-1)+"     " );

//                System.out.println(Collections.frequency(ar,ar1.get(j))+"  "+ar1.get(j));
                if(Collections.frequency(ar,ar1.get(j)-1)<Collections.frequency(ar,ar1.get(j))){
                    inc=1;
                    break;
                }
            }}
                else
                    inc=1;
            if(inc==1){
                System.out.println("No");
            }
            else
                System.out.println("Yes");
        }
    }}
