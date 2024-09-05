import java.util.Scanner;

public class Chatroom {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String d="hello";
        int a=0,f=0;
        for(int i=0;i<s.length();i++){
            if(d.charAt(a)==s.charAt(i)){
                   a++;
                   if(a>4){
                       f=1;
                       break;
                   }
            }
        }
        if(f==1)
        System.out.println("YES");
        else
            System.out.println("NO");
    }
}
