import java.util.Scanner;
public class HelpfulMaths {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
//2+3+3+1+2+2+2+1+1+2+1+3+2+2+3+3+2+2+3+3+3+1+1+1+3+3+3+2+1+3+2+3+2+1+1+3+3+3+1+2+2+1+2+2+1+2+1+3+1+1
        int l=s.length();
        if(l>1){
        for(int i=0;i<l-2;i=i+2){

            for(int j=i+2;j<l;j+=2){

                char c=s.charAt(i);
                char c1=s.charAt(j);
                if(c>c1){
                    char[] ch = s.toCharArray();

                    // Swapping using XOR operation
                    ch[i] = (char)(ch[i] ^ ch[j]);
                    ch[j] = (char)(ch[i] ^ ch[j]);
                    ch[i] = (char)(ch[i] ^ ch[j]);

                    s= String.valueOf(ch);


                }


            }

            }
        System.out.print(s);
        }
        else
            System.out.println(s);

        }

    }

