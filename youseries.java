
public class youseries {
    public static void main(String args[]) {
        int n = 1;

        for (int i = 1; i <=5; i++) {
            for (int j=1;j<=i;j++){
                if(j==1||i==1||j==i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for(int k=0;k<=(5-i)*2;k++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                if(j==1||i==1||j==i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 5; i >=1; i--) {
            for (int j=1;j<=i;j++){
                if(j==1||i==1||j==i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for(int k=0;k<=(5-i)*2;k++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                if(j==1||i==1||j==i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
