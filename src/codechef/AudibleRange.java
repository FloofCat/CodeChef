package codechef;

import java.util.Scanner;

public class AudibleRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = scanner.nextInt();

        getInput(scanner, numberInput);
    }

    private static void getInput(Scanner scanner, int in) {
        for(int i = 0; i < in; i++) {
            int input = scanner.nextInt();
            if(isInRange(input)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean isInRange(int input) {
        if(input >= 67 && input <= 45000) {
            return true;
        }

        return false;
    }
}
