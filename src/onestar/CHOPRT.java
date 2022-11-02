package onestar;

import java.util.Scanner;

public class CHOPRT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numInput = sc.nextInt();

        parseData(sc, numInput);
    }

    private static void parseData(Scanner sc, int num) {
        for(int i = 0; i < num; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a > b) {
                System.out.println(">");
            } else if (a < b) {
                System.out.println("<");
            } else if (a == b) {
                System.out.println("=");
            }
        }
    }
}
