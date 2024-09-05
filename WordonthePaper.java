import java.util.Scanner;

public class WordonthePaper {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        String s="";
        for(int k=0;k<t;k++){
        for(int i=0;i<8;i++){
            s=sc.nextLine();
//            System.out.println(s.length());
            if(s.length()>0){
                for(int j=0;j<s.length();j++){
                    if(s.charAt(j)!='.'){
                        System.out.print(s.charAt(j));
                    }
                }
            }

        }
        System.out.println();
        }
    }
}
