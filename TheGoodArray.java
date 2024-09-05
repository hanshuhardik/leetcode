import java.util.Scanner;

public class TheGoodArray {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++){
        int n=sc.nextInt();
        int k=sc.nextInt();
        int div=0;int count=0;
        int[] ar=new int[n];
       if(k==1){
           System.out.println(n);
       }
        else{
            int n2=n/2;
            while(n2<n){
                int a=(int)Math.ceil((double)n2/k);
//                System.out.println(a+" a");
                int leftout=n-n2;
                int common=n2-leftout;
                if(common<0)
                    common=0;
                a=a-1;int p=0;
                int ui=1;
                if(common>0){
                    while(a>0){
                        common--;
                        a--;
                        p++;

                    }
                    if(a==0){
                        ui=ui*2;
                        ui=ui+p;
                    }
                    else{
                        ui=ui+a;
                        ui=ui*2;
                        ui=ui+p;
                    }


                }else{
                    ui=ui+a;
                }
               if(div<ui)
                   div=ui;



                n2++;
            }
            System.out.println(div);




       }
    }
    }
}
