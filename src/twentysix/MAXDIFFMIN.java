package twentysix;

import java.util.Scanner;

public class MAXDIFFMIN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        parseData(num, sc);
    }

    private static void parseData(int num, Scanner sc) {
        for(int i = 0; i < num; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            System.out.println(Math.max(Math.max(a,b),c) - Math.min(Math.min(a,b),c));
        }
    }
}
