import java.util.Scanner;

public class BeautifulYear {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
int t=0,f=0;
        for(int i=n+1;i<=9999;i++){
            String s=Integer.toString(i);

            for(int k=0;k<4;k++){
                char c=s.charAt(k);

                if(s.indexOf(c)==s.lastIndexOf(c)){

                    t++;
                }
                if(t==1){
                    f++;
                    t=0;
                }


            }

            if(f==4){
                System.out.println(i);
                break;
            }
            f=0;



        }
    }
}
