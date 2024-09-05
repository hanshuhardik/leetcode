import java.util.Scanner;
public class LuoTianyiAndthePalindromeString {
    public static int Reverse(String sub){
        String s="";
        for(int j=(sub.length()-1);j>=0;j--)
        {
           s+=sub.charAt(j);
        }
        if(s.equals(sub))
            return 1;
        else
            return 0;

    }
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<t;i++){
            String s=sc.nextLine();
            String s1="";
                    s1=s.substring(1,s.length());
            if(Reverse(s1)==1)
                System.out.println("-1");
            else
                System.out.println(s1.length());
        }
    }
}
