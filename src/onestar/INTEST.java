package onestar;

import java.util.Scanner;

public class INTEST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int div = scanner.nextInt();

        parseData(scanner, num, div);
    }

    private static void parseData(Scanner scanner, int num, int div) {
        int count = 0;
        for(int i = 0; i < num; i++) {
            int a = scanner.nextInt();

            if(a % div == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
