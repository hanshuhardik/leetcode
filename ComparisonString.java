import java.util.Scanner;

public class ComparisonString {
    public static int Count(String s){
        int i=1;int max=1;
        for(int k=0;k<s.length()-1;k++){
            if(s.charAt(k)==s.charAt(k+1))
                i++;
            else
                i=1;
            if(max<i)
                max=i;
        }

        return max;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
           System.out.println(Count(s)+1);
        }
    }
}
