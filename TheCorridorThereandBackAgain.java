import java.util.Scanner;

public class TheCorridorThereandBackAgain {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++){
        int n=sc.nextInt();
        int k=0,k1=0;
        for(int j=0;j<n;j++){
           int a=sc.nextInt();
           int s=sc.nextInt();
            if(a==1 && s==1){
                k=1;

            } else if (a>1 && s==1) {
                k=a;

            } else if (a==1 && s>1) {
                if(s%2!=0)
                    s+=1;
                k=a-a+((int)Math.floor((double)(s)/2));
            } else if (a>1 && s>1) {

                k=a+((int)Math.floor((double)(s-1)/2));
            }
            if(k<k1 || k1==0){
                k1=k;
            }
        }
        System.out.println(k1);
    }
    }
}
