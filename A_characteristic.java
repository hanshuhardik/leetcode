import java.util.ArrayList;
import java.util.Scanner;

public class A_characteristic {
    public static int acc(ArrayList ar1){
        int inc=0;
        for(int i=0;i<ar1.size();i++){
            for(int j=i+1;j<ar1.size();j++){
                int a= (int) ar1.get(i);
                int b= (int) ar1.get(j);

                if((a*b)==1){
                    inc++;
                }
            }
        }
        return inc;
    }
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++){
        int n=sc.nextInt();
        int k=sc.nextInt();
        ArrayList<Integer> ar=new ArrayList<>();
        for(int j=0;j<n;j++){
            ar.add(1);
        }int f=0;
        for(int j=0;j<n;j++){
            if(acc(ar)==k){
                System.out.println("Yes");
                for(int l=0;l<ar.size();l++){
                    System.out.print(ar.get(l)+" ");
                }
                System.out.println();
                 f=1;
                break;
            }
            else {
                ar.remove(j);
                ar.add(j,-1);
            }
        }
        if(f==0){
            System.out.println("No");
        }




    }
    }
}
