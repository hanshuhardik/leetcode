import java.util.Scanner;

public class ArrayColoring {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int e=0,o=0;
        for(int i=0;i<n;i++){
            int n1=sc.nextInt();
            for(int j=0;j<n1;j++){
                int a=sc.nextInt();
                if(a%2==0)
                    e++;
                else
                    o++;
            }
            if(o%2==0){
                System.out.println("Yes");
            }
            else
                System.out.println("No");
            e=0;o=0;
        }
    }
}
