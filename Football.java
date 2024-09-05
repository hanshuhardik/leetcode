import java.util.Scanner;

public class Football {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int l=s.length();int a=0,b=0;
        for(int i=0;i<l;i++){
            char c=s.charAt(i);
            if(c=='1'){
                a++;
            b=0;}
            if(c=='0'){
                b++;
            a=0;}
            if(a==7 || b==7)
                break;
        }
        if(a==7 || b==7)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
