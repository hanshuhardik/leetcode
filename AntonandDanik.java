import java.util.Scanner;

public class AntonandDanik {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    sc.nextLine();int b=0,a=0;
    String s=sc.nextLine();
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='A')
            a++;
        if(s.charAt(i)=='D')
            b++;
    }
    if(b>a)
        System.out.println("Danik");
    else if(b<a)
        System.out.println("Anton");
    else
        System.out.println("Friendship");
    }
}
