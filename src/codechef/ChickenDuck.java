package codechef;

import java.util.Scanner;

public class ChickenDuck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numInput = scanner.nextInt();

        parseData(scanner, numInput);
    }

    private static void parseData(Scanner scanner, int num) {
        for(int i = 0; i < num; i++) {
            scanner.useDelimiter("\n");
            String string = scanner.next();

            String[] strings = string.split(" ");

            System.out.println(returnChickDuck(
                    Integer.parseInt(strings[0]),
                    Integer.parseInt(strings[1]),
                    Integer.parseInt(strings[2])));
        }
    }

    private static String returnChickDuck(int chicken, int duck, int total) {
        if(total % chicken == 0 && total % duck == 0) {
            return "ANY";
        } else if (total % chicken == 0) {
            return "CHICKEN";
        } else if (total % duck == 0) {
            return "DUCK";
        } else {
            return "NONE";
        }
    }
}
