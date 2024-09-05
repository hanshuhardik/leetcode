import java.util.Scanner;

public class ChipsonheBoard {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++){
        int n=sc.nextInt();
        int[] ar=new int[n];
        int[] ar1=new int[n];int a=0,b=0;
        for(int j=0;j<n;j++){
            ar[j]=sc.nextInt();
            if(ar[j]<a||a==0){
                a=ar[j];
            }
            }
        for(int j=0;j<n;j++){
            ar1[j]=sc.nextInt();
            if(ar1[j]<b||b==0){
                b=ar1[j];
            }
        }
        long row=0;long col=0;
        for(int j=0;j<n;j++){
            row+=a+ar1[j];
            col+=b+ar[j];
            }


        if(row>col){
            System.out.println(col);
        }
        else
            System.out.println(row);
    }
    }
}
