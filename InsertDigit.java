import java.util.Scanner;

public class InsertDigit {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int d=sc.nextInt();
            sc.nextLine();int a=-1;
            String s=sc.nextLine();
            for(int j=0;j<s.length();j++){
                char c=s.charAt(j);
                String s1=Character.toString(c);
                int num=Integer.parseInt(s1);
//                System.out.println(num+" "+d);
                if(num<d){
                    a=j;
                break;}
            }
            if(a==-1)
                System.out.println(s+d);
            else
            System.out.println(s.substring(0,a)+d+s.substring(a,s.length()));
        }
    }
}
