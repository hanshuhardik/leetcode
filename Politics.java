import java.util.Scanner;

public class Politics {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
         int n=sc.nextInt();
         int k=sc.nextInt();
         String s="";int res=1;
         sc.nextLine();
         for(int j=0;j<n;j++){
             String p=sc.nextLine();
             if(j==0){
                 s=p;
             }
             else {
                 if(s.equals(p)){
                     res++;
                 }
             }
         }
         System.out.println(res);
        }
    }
}
