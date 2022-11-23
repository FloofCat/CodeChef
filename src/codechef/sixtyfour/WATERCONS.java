package codechef.sixtyfour;

import java.util.Scanner;

public class WATERCONS {

    private static int WATER = 2000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();

        while(s-->0) {
            int a = sc.nextInt();

            if(a >= WATER) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
