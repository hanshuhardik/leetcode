import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l = s.length();
        int t = 0;
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            if (c == '4' || c == '7')
                t++;
        }
        if (t == 4 || t == 7)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
