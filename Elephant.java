import java.util.Scanner;
public class Elephant {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=0;
        while(n>0){
            if(n>=5)
                n-=5;
            else if (n>=4)
                n-=4;
            else if (n>=3)
                n-=3;
            else if (n>=2)
                n-=2;
            else if(n>=1)
                n-=1;
            t++;

        }
        System.out.println(t);

    }
}
