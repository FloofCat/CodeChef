package onestar;

import java.util.Scanner;

public class FLOW013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numInput = scanner.nextInt();

        parseData(scanner, numInput);
    }

    private static void parseData(Scanner scanner, int num) {
        for(int i = 0; i < num; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if(a + b + c == 180) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
