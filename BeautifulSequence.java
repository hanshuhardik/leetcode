import java.util.ArrayList;
import java.util.Scanner;

public class BeautifulSequence {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++){
        int n=sc.nextInt();
        ArrayList<Integer> ar=new ArrayList<>();
        for(int j=0;j<n;j++){
            ar.add(sc.nextInt());
        }int res=0;
        for(int j=0;j<n;j++){
            if(j+1==ar.get(j)){
                res=1;
            break;}
            else
            {
                for(int k=j+1;k<n;k++){
                    if(j+1==ar.get(k)){
                        res=1;
                        break;
                    }
                }
            }
        }
        if(res==1){
            System.out.println("Yes");

        }
        else
            System.out.println("No");
    }
    }
}
