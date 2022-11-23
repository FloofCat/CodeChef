package codechef.sixtyfour;

import java.util.Scanner;

public class BROKENSTRING {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while(n-->0) {
            int size = sc.nextInt();
            String s = sc.next();

            if(s.substring(0, size / 2).equals(s.substring((size / 2), size))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
