import java.util.Scanner;
public class Word {
    public static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int u=0,p=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>=65 && c<=90)
                u++;
            else
                p++;

        }
        if(u>p)
            System.out.println(s.toUpperCase());
        else
        System.out.println(s.toLowerCase());

    }
}
