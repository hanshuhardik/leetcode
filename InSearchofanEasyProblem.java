import java.util.Scanner;

public class InSearchofanEasyProblem {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();int a= 0;
    for(int i=0;i<n;i++){
        if(sc.nextInt()==1){
            System.out.println("HARD");
            a=1;
        break;}


    }
    if(a!=1)
        System.out.println("EASY");
    }
}
