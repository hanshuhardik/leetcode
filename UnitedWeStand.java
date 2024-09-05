import java.util.Scanner;

public class UnitedWeStand {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();int count=0;
        int max=0;int b1=0,c1=0;
        int[] a=new int[n];

        int[] c=new int[n];
        for(int i=0;i<n;i++){
            int n1=sc.nextInt();
            a=new int[n1];

            for(int j=0;j<n1;j++){
                 a[j]=sc.nextInt();
                if(max<a[j]){
                    max=a[j];
                }
        }
            for(int k=0;k<n1;k++){
                if(a[0]==a[k]){
                    count++;
                }
            }
            if(count==(n1)){
                System.out.println("-1");

            }
            else{
                for(int l=0;l<n1;l++){
                    if(max==a[l]){
                        c[c1]=a[l];
                        c1++;
                    }
                }
                System.out.println((n1-c1)+" "+c1);
                for(int m=0;m<n1;m++){
                    if(a[m]!=max){
                        System.out.print(a[m]+" ");

                    }
                }
                System.out.println();
                for(int z=0;z<c1;z++){
                    System.out.print(c[z]+" ");
                }
                System.out.println();

            }
            c1=0;max=0;count=0;
    }
        }}