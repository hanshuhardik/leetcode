import java.util.Scanner;

public class EscalatorConversations {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();int p=0;
        for(int i=0;i<n1;i++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            int h=sc.nextInt();
            for(int j=0;j<n;j++){
                int a=sc.nextInt();
//                System.out.println(a);
//                System.out.println(a-h+" ="+(a-h)%k);
                if(Math.abs(a-h)>0){
                if((a-h)%k==0){
                    if(Math.abs((a-h)/k)<m)
                        p++;
//                    System.out.println(a+" "+p);
                }}
            }
            System.out.println(p);
            p=0;
        }
    }
}
