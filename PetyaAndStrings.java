import java.util.Scanner;
public class PetyaAndStrings {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();
        String s1=sc.nextLine().toLowerCase();
        int l=s.length();int t=0;
        for(int i=0;i<l;i++){

            if(s.charAt(i)>s1.charAt(i)){
                System.out.println("1");
            t=1;break;
            }
            else if (s1.charAt(i)>s.charAt(i)) {
                System.out.println("-1");
                t=1;break;

            }
        }


        if(t!=1)
            System.out.println("0");
    }
}
