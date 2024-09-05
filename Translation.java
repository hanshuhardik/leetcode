import java.util.Scanner;

public class Translation {
    public static void main(String ARGS[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();String s1="";
        for(int i=t.length()-1;i>=0;i--){
            char c=t.charAt(i);
            s1+=c;
        }
        if(s.equalsIgnoreCase(s1))
            System.out.println("YES");
        else
            System.out.println("NO");

    }}
