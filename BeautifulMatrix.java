import java.util.Scanner;
public class BeautifulMatrix {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[][] a=new int[5][5];
        int y,z,r=0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                int f=sc.nextInt();
                if (f == 1) {
                    y=Math.abs(j-3);
                    z=Math.abs(i-3);
                    r=z+y;
                }
            }
        }
        System.out.println(r);
    }
}
