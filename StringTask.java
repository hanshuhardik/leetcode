import java.util.Scanner;

public class StringTask {
    public static void main(String ARGS[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();String s1="";char c ;
        for(int i=0;i<s.length();i++) {
             c=s.charAt(i);

            if(c!='a')
                if(c!='e')
                    if(c!='i')
                        if(c!='o')
                            if(c!='u')
                                if(c!='y')
                                s1=s1+'.'+c;


        }
        System.out.println(s1);
        }
    }

