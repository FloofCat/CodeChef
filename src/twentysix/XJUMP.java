package twentysix;

import java.util.Scanner;

public class XJUMP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        parseData(num, sc);
    }

    private static void parseData(int num, Scanner sc) {
        for(int i = 0; i < num; i++) {
            int stairs = sc.nextInt();
            int step = sc.nextInt();

            int n = 0;
            n = n + (int) Math.floor(stairs / step);
            n = n + (stairs % step);

            System.out.println(n);
        }
    }
}
