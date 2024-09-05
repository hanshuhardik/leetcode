import java.util.Scanner;

public class MorningSandwich {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int b=sc.nextInt();
            int c=sc.nextInt();
            int h=sc.nextInt();
            if(b<=c+h){
                System.out.println(b+b-1);
            }
            else{
                System.out.println(2*(c+h)+1);
            }
        }
    }
}
