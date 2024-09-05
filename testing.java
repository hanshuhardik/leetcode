import java.util.*;
import java.math.BigInteger;

class testinig{
    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ls = new ArrayList<>();
        List<String> wordcheck = new ArrayList<>(Arrays.asList(words));
        List<String> word = new ArrayList<>(Arrays.asList(words));
        int l=words[0].length();
        int e=l*words.length;
        int b=0;
        String ss=s.substring(b,e);
        System.out.println(ss);
        //System.out.println(ss.substring(0,4));
        //System.out.println(ss.substring(ss.length()-4));
        int i=0;
        while(i+l<=e){
                System.out.println(ss.substring(i,i+l));
            if(word.remove(ss.substring(i,i+l)))
                System.out.println(ss.substring(i,i+l));
                i+=l;
            }else{
                i++;
            }
        }

        while(e+1<=s.length()){
            if(wordcheck.contains(ss.substring(0,l))){
                word.add(ss.substring(0,l));
            }
            ss=ss.substring(1)+s.charAt(e);
            System.out.println(ss);
            e++;
            System.out.println(word.remove(ss.substring(0,l)));
            System.out.println(word.remove(ss.substring(ss.length()-l)));
            System.out.println(word);
            if(word.isEmpty()){
                ls.add(e-l*words.length);
                System.out.println(ls);
            }

        }


        return ls;
    }

public static void main(String args[]){
   String s = "barfoothefoobarman";

   String []words = {"bar","foo"};
   System.out.println(findSubstring(s,words));



}
}