import java.util.Scanner;
public class code360Character {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String c=sc.next();
        int n=c.charAt(0);
        if(n<=122 && n >=97)
            System.out.println(0);
        else if(n<=90 && n >=65)
            System.out.println(1);
        else
         System.out.println(-1);
    }
}
