package codechef;

import java.util.Scanner;

public class GCDLCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberVal = scanner.nextInt();

        parseData(scanner, numberVal);
    }

    private static void parseData(Scanner scanner, int num) {
        for(int i = 0; i < num; i++) {
            scanner.useDelimiter("\n");
            String st = scanner.next();

            String[] strings = st.split(" ");

            int a = Integer.parseInt(strings[0]);
            int b = Integer.parseInt(strings[1]);

            System.out.println(getGCD(a,b) + " " + getLCM(a,b));
        }
    }

    private static int getLCM(int a, int b) {
        return (a*b) / getGCD(a, b);
    }

    private static int getGCD(int a, int b) {
        for(int i = Math.max(a,b); i >= 1; i--) {
            if(a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return Math.min(a, b);
    }
}
