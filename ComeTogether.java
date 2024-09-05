import java.util.Scanner;

public class ComeTogether {
    public static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
           int x1=sc.nextInt();
           int y1=sc.nextInt();
           int x2=sc.nextInt();
           int y2=sc.nextInt();
           int x3=sc.nextInt();int inc=1;
           int y3=sc.nextInt();
           if(x1<x2 && x1<x3 ){

               if(x2>x3){

                   inc+=x3-x1;
               }
               else{
                   inc+=x2-x1;
               }

           }
            if(x1>x2 && x1>x3 ){

                if(x2>x3){

                    inc+=x1-x2;
                }else{
                    inc+=x1-x3;
                }
            }
//            System.out.println(inc);
            if(y1<y2 && y1<y3 ){
                if(y2>y3){
                    inc+=y3-y1;
                }else{
                    inc+=y2-y1;
                }
            }
            if(y1>y2 && y1>y3 ){
                if(y2>y3){
                    inc+=y1-y2;
                }else{
                    inc+=y1-y3;
                }
            }
            System.out.println(inc);
        }
    }
}
