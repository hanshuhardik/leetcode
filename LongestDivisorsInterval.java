import java.util.Scanner;

public class LongestDivisorsInterval {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            long a=sc.nextLong();
            for(int j=1;j<a+2;j++){
                if(a%j!=0){
                    System.out.println(j-1);
                    break;
                }
            }
        }
    }
}
