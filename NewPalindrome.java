import java.util.ArrayList;
import java.util.Scanner;

public class NewPalindrome {
    public static int count(String s,char c){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c)
                count++;
        }
        return count;
    }
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
        sc.nextLine();
    for(int i=0;i<t;i++){
        ArrayList<Character> ar=new ArrayList<>();
        String s=sc.nextLine();
        int l=s.length();
        if(l<4){
            System.out.println("No");
        }
        else{
            for(int j=0;j<l;j++){
                char c=s.charAt(j);
                if(!ar.contains(c))
                    ar.add(c);
            }int inc=0;
//            System.out.println(ar);
            for(int j=0;j<ar.size();j++){
//System.out.println(count(s,ar.get(j))+" "+ar.get(j));
                    if(count(s,ar.get(j))>=2){
                        inc++;
                    }
            }
            if(inc>=2)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
    }
}
