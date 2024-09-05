import java.util.Scanner;

public class LoveStory {
    public static void main(String  args[]){
        Scanner sc=new Scanner(System.in);
        String sub="codeforces";
        int t=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<t;i++){
            String s=sc.nextLine();
            int inc=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)!=sub.charAt(j))
                    inc++;
            }
            System.out.println(inc);
        }
    }
}
