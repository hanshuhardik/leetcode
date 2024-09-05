import java.util.Scanner;
import java.util.Vector;
public class shivjee {
    static  void create(Vector n){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 10 vectors:");
        for(int i=0;i<10;i++)
        {
            n.add(sc.nextInt());
        } 
    }
    static void print(Vector n){
        System.out.println("the Vectors are:-");
        for(int i=0;i<10;i++){
            System.out.print(n.get(i)+",");
        }
    }
    public static void main(String args[]){
        Vector<Integer> n=new Vector<>(10);
        create(n);

        print(n);

    }

}
