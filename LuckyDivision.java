import java.util.Scanner;

public class LuckyDivision {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n%47==0 || n%744==0||n%7==0||n%4==0||n%477==0){
            System.out.println("YES");}
            else
                System.out.println("NO");

    }
}
