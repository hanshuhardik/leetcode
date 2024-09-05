import java.util.Scanner;

public class NotaSubstring {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    sc.nextLine();
    for(int i=0;i<t;i++){
        String s=sc.nextLine();
            int l=s.length();
            String s1="";int a=0;
            while(a<l){
                s1+="()";
                a++;
            }
//            System.out.println(s1);
            if(s1.indexOf(s)>-1){
                a=0;s1="";String s2="";
                while(a<l){
                   s1+="(";
                   s2+=")";
                    a++;
                }
                s1+=s2;
            }
//            System.out.println(s1);
            if(s1.indexOf(s)>-1){
                System.out.println("NO");
            }else {
                System.out.println("Yes");
            System.out.println(s1);
            }

    }
    }
}
