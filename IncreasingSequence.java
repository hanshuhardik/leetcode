import java.util.Scanner;

public class IncreasingSequence {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();int b=0;
        int[] ar=new int[1];
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            ar=new int[n];
            for(int j=0;j<n;j++){
                ar[j]=sc.nextInt();

            }
            b=1;
            for(int j=0;j<n;j++){
                if(ar[j]==b)
                    b++;
                b++;
            }
            System.out.println(b-1);

        }
    }
}
