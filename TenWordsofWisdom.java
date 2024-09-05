import java.util.Scanner;

public class TenWordsofWisdom {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();int b1=0;int win=0;
    for(int i=0;i<t;i++){
        int n=sc.nextInt();
        for(int j=0;j<n;j++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a<=10 && b>b1){
                b1=b;
                win=j+1;
            }
        }
        System.out.println(win);
        win=0;b1=0;
    }
    }
}
