import java.util.Scanner;

public class WalkingMaster {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int inc=0;
            while(y!=y1 && y<y1){
                int y2=y1-y;
                y+=y2;
                x=x+y2;
                inc+=y2;
            }
            while(x!=x1 && x>x1){
                int x2=x1-x;
                x+=x2;
                inc+=Math.abs(x2);
            }
            if(x==x1 && y==y1){
                System.out.println(inc);
            }
            else
                System.out.println("-1");
        }
    }
}
