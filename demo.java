import java.io.*;
import java.util.Scanner;
import java.util.*;
public class demo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> ar=new ArrayList<Integer>();
        ArrayList<Integer> ar1=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            ar.add(a);
            ar1.add(a);
        }
        Collections.sort(ar1);int t=0;
        for(int i=0;i<n;i++){
            if(ar.get(i)%2==0 && ar1.get(i)%2!=0)
                t=1;
            if(ar.get(i)%2!=0 && ar1.get(i)%2==0)
                t=1;

        }if(t==1)
            System.out.println("No");
        else
        System.out.println("Yes");
    }
}
