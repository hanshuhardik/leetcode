import java.util.ArrayList;
import java.util.Scanner;

public class Desorting {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> ar=new ArrayList<>();int t=1;
        for(int i=0;i<n;i++) {
            int n1=sc.nextInt();
            for(int j=0;j<n1;j++){
                int a=sc.nextInt();
                ar.add(a);
                if(j>0){
                    if(ar.get(j-1)<=a){
                        t++;
                    }

                }}
                if(t==n1){
                    int diff=ar.get(n1-1);
                    for(int j=0;j<n1-1;j++){
                        if(ar.get(j+1)-ar.get(j)<diff){
                            diff=ar.get(j+1)-ar.get(j);

//                            System.out.println(diff+" "+di);

                        }

                    }
                    if(diff==0)
                        System.out.println("1");
                    else if(diff%2==0)
                        System.out.println((diff+2)/2);
                    else
                        System.out.println((diff+1)/2);

                }
                else
                    System.out.println("0");

                t=1;ar.clear();

        }
    }}
