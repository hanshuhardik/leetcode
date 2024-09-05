import com.sun.java.swing.plaf.windows.WindowsTextAreaUI;

import java.util.ArrayList;
import java.util.Scanner;

public class GamewithBoard {
    public static void main(String ARGS[]) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();char c='b';char c1='a';char temp=' ';
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            if(n-2>2){
                System.out.println("Alice");
            } else  {
                System.out.println("Bob");
            }


        }


    }
}
