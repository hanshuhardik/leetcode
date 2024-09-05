import java.util.Scanner;

public class YuraNewName {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    sc.nextLine();
    for(int i=0;i<t;i++){
        String s=sc.nextLine();
        int b=0;
        if(s.length()==1){
            if(s.charAt(0)=='^'){
                System.out.println("1");
            }
            else
                System.out.println("2");
        }
        else{
        for(int j=0;j<s.length();j++){
            if(j==0){
                if(s.charAt(j)!='^')
                    b++;
//                System.out.println(j+" "+b);
            }
            if(j>0){
                if(s.charAt(j)=='_'&& s.charAt(j-1)=='_'){
                    b++;
//                    System.out.println(j+" "+b);
                }
                if(j==s.length()-1){
                    if(s.charAt(j)=='_'){
                        b++;
//                        System.out.println(j+" "+b);
                    }
                }

            }
        }
        System.out.println(b);
        }


    }
    }
}
