import java.util.Scanner;
 public class First{
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=0;
        sc.nextLine();
        String s=sc.nextLine();
        int l=s.length();
        for(int i=0;i<l-1;i++){

            if(s.charAt(i)==s.charAt(i+1)){
                t++;
            }
        }
        System.out.println(t);


     }
 }