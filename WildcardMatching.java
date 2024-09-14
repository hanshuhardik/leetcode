import java.util.HashSet;
import java.util.Stack;

public class WildcardMatching {
    public static boolean isMatch(String s, String p) {
        int pass=0;
        Stack<Character> set=new Stack<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        System.out.println(set);
        for(int i=0;i<p.length();i++){
            System.out.println(i);
            System.out.println(set);
            char c=p.charAt(i);
                if(set.contains(c)){
                    System.out.println(c);
                    set.remove(c);
                    System.out.println(set);
                }



            if(c=='*')return true;
            if(c=='?')pass++;
        }
        if(set.size()==pass)return true;
        return false;
    }
    public static  void main(String args[]){
        String s="ab", p = "?a";
        System.out.println(isMatch(s,p));
    }
}
