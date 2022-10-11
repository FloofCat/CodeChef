package codechef;

import java.util.Scanner;

public class SumValue {

    private static int values = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        parseValue(num);

        System.out.println(values);
    }

    private static void parseValue(int num) {
        for(int i = 1; i < 100; i++) {
            for(int j = 1; j < 100; j++) {
                if(i + j == num) {
                    values += 1;
                }
            }
        }
    }
}
