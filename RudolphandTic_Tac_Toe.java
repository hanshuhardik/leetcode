import java.util.Scanner;

public class RudolphandTic_Tac_Toe {
    public static void main(String ARGS[]) {


        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        String s1="";
        String s2="";
        String s3="";
        sc.nextLine();
        for(int i=0;i<t;i++){

                s1=sc.nextLine();
                s2=sc.nextLine();
                s3=sc.nextLine();


       if(s1.length()==s2.length() && s2.length()==s3.length()){
           char c=' ';
          if(s1.equalsIgnoreCase("OOO") ||s1.equalsIgnoreCase("XXX")||s1.equalsIgnoreCase("+++") )
              c=s1.charAt(1);
          else if(s2.equalsIgnoreCase("OOO")||s2.equalsIgnoreCase("XXX")||s2.equalsIgnoreCase("+++"))
              c=s2.charAt(1);
          else if(s3.equalsIgnoreCase("OOO")||s3.equalsIgnoreCase("XXX")||s3.equalsIgnoreCase("+++"))
              c=s3.charAt(1);
          else if(s1.charAt(0)==s2.charAt(0) && s2.charAt(0)==s3.charAt(0) && s1.charAt(0)!='.')
              c=s2.charAt(0);
          else if(s1.charAt(1)==s2.charAt(1) && s2.charAt(1)==s3.charAt(1)&& s1.charAt(1)!='.')
              c=s2.charAt(1);
          else if(s1.charAt(2)==s2.charAt(2) && s2.charAt(2)==s3.charAt(2)&& s1.charAt(2)!='.')
              c=s2.charAt(2);
          else if(s1.charAt(0)==s2.charAt(1)&& s2.charAt(1)==s3.charAt(2))
              c=s3.charAt(2);
          else if(s1.charAt(2)==s2.charAt(1)&& s2.charAt(1)==s3.charAt(0))
              c=s3.charAt(0);
          if(c!='.' &&c!=' ')
              System.out.println(c);
          else
              System.out.println("DRAW");
          c=' ';

       }}

    }
}
