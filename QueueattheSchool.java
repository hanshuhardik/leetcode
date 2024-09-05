import java.util.Scanner;

public class QueueattheSchool {
    public static void main(String ARGS[]) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int t=sc.nextInt();
    sc.nextLine();
    String s=sc.nextLine();String s1="";
    int a=1;
    while(a<=t){
    for(int i=0;i<s.length()-1;i++){

        if(s.charAt(i)=='B' && s.charAt(i+1)=='G'){
            s1=s1+s.charAt(i+1)+s.charAt(i);i+=1;
        }
        else
            s1=s1+s.charAt(i);

    }
    if(s1.length()<s.length()){
        s1=s1+s.charAt(s.length()-1);
    }
    s=s1;
    s1="";
        a+=1;
    }
    System.out.println(s);

    }
}
