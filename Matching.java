import java.util.Scanner;

public class Matching {
    public static void match(String s){
        int res=1;
        for(int i=0;i<s.length();i++){
            if(i==0){
                if(s.charAt(i)=='?')
                    res*=9;
                else if (s.charAt(i)=='0') {
                    res*=0;
                }
                else
                    res*=1;
            }
            else {
                if(s.charAt(i)=='?')
                    res*=10;
                else
                    res*=1;
            }
        }
        System.out.println(res);
    }
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    sc.nextLine();
    for(int i=0;i<t;i++){
        String s=sc.nextLine();
        match(s);

    }
    }
}
