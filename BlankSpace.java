import java.util.Scanner;

public class BlankSpace {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++){
        int n=sc.nextInt();int inc=0;int temp=0;
        for(int j=0;j<n;j++){
            int a=sc.nextInt();
            if(a==0)
                inc++;
            else
                inc=0;

                if(inc>temp){
                    temp=inc;

                }

        }
        System.out.println(temp);
    }
    }
}
