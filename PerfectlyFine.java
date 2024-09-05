import java.util.Scanner;

public class PerfectlyFine {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++){
        int n=sc.nextInt();
        int f=200001;int min1=200001;int min2=200001;
        for(int j=0;j<n;j++){
            int a=sc.nextInt();

            int s=sc.nextInt();
//System.out.println(a+"  "+s);
            if(s==11){
                if(f>a)
                f=a;
            }
            else if(s==10){
                if(min1>a)
                    min1=a;
//                System.out.println(min1+" min1");
            } else if (s==01 ){
                if(min2>a)
                    min2=a;
//                System.out.println(min2+" min2");
            }

        }
        if(f!=200001 && f<(min1+min2)){
            System.out.println(f);
        } else if (min1<200001 && min2<200001) {
            System.out.println(min1+min2);
        }
        else
            System.out.println("-1");

    }
    }
}
