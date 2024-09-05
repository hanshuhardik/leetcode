import java.util.ArrayList;
import java.util.Scanner;

public class MusicalPuzzle {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            ArrayList<String> ar=new ArrayList<>();
            sc.nextLine();
                String s=sc.nextLine();
            for(int j=1;j<n;j++){
                String c=String.valueOf(s.charAt(j));
                String c1=String.valueOf(s.charAt(j-1));
                String sum = c1+c;
              if(!ar.contains(sum))
                  ar.add(sum);
            }
            System.out.println(ar.size());

        }
    }
}
