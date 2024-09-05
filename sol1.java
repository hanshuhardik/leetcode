import javafx.css.StyleableStringProperty;

import java.util.*;
import java.lang.*;
public class sol1 {

    public static boolean palidrome(String s){
        String ns="";
        for(int i=s.length()-1;i>=0;i--){
            ns+=s.charAt(i);
        }
        if(ns.equals(s)) {
            System.out.println("t");
            return true;
        }

        return false;
    }
    public static String longestPalindrome(String s) {
        if(s.length()==1){
            return s;
        }
        String ns="";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                String ts=s.substring(i,j+1);
                System.out.println(ts);
                if(palidrome(ts)){
                    System.out.println(ts);
                    if(ts.length()>ns.length())ns=ts;
                    System.out.println(ns);
                }

            }
        }
return ns;
    }


    public static void main(String[] args) {
       String s = "a"
               ,t = "nagaram";
      //String  s = "gcmbf", goal = "fgcmb";
        System.out.println(longestPalindrome(s));
    }
    }

