import java.util.Scanner;
public class BoyorGirl {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();int t=0;
        int l=s.length();
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j))
                    t++;
            }

              if(t>1)
                  l=l-1;
              t=0;

        }
       if(l%2==0)
           System.out.println("CHAT WITH HER!");
       else
           System.out.println("IGNORE HIM!");
    }

}
