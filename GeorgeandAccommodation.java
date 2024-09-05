import java.util.Scanner;

public class GeorgeandAccommodation {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();int f=0;
    for(int i=0;i<n;i++){
        int p=sc.nextInt();
        int q=sc.nextInt();
        if(q-p>=2){
            f++;
        }
    }
    System.out.println(f);
    }
}
