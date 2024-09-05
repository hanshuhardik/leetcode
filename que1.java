import com.sun.scenario.effect.Merge;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;
public class que1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Vector<Integer> v1=new Vector<>();
        Vector<String> v2=new Vector<>();
        System.out.print("enter number :");
        for(int i=0;i<4;i++){
            int num=sc.nextInt();
            v1.add(num);
        }
        sc.nextLine();
        System.out.print("enter String:");
        for(int i=0;i<4;i++){
            String s=sc.nextLine();
            v2.add(s);
        }
        System.out.print("Enter the number :");
        int inn=sc.nextInt();
        int g=v1.indexOf(inn);
        if(0<=g){
            System.out.print(v2.get(g));
        }else{
            System.out.print("number not found");
        }
    }
}
