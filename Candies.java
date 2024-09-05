import java.util.Scanner;

public class Candies {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();int x=1;int y=0;
    for(int i=1;i<t;i++){

        if(i==1){
            x=(2*x)+1;
            y=x;
        }


        System.out.println(x +" "+y+"  ="+(x-y));

        x=(2*x)+1;
        y=(2*y)-1;
    }
    }
}
