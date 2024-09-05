import java.util.Scanner;
public class eas {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the first string  : ");
        String s1=sc.nextLine();
        System.out.print("enter the second string  : ");
        String s2=sc.nextLine();
        int l1=s1.length();
        int l2=s2.length();
        for(int i=0;i<l1;i++){
            for(int j=0;j<l2;j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    System.out.print(s1.charAt(i)+" "+i+","+j);
                }
            }
        }
    }
}
