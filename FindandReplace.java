import java.util.ArrayList;
import java.util.Scanner;

public class FindandReplace {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();

    for(int i=0;i<t;i++){
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        int res=0;
        for(int j=0;j<s.length();j++){
            char c=s.charAt(j);
            for(int k=j+1;k<s.length();k++){
                if(c==s.charAt(k)){
                    if(j%2==0 && k%2!=0 || j%2!=0 && k%2==0){
                        res=1;
                        break;
                    }

                }
            }
        }
        if(res==1){
            System.out.println("No");
        }
        else
            System.out.println("Yes");
    }

    }
}
