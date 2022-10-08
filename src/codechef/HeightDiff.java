package codechef;

import java.util.Scanner;

public class HeightDiff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = scanner.nextInt();

        parseData(scanner, numberInput);
    }

    private static void parseData(Scanner scanner, int num) {
        for(int i = 0; i < num; i++) {
            scanner.useDelimiter("\n");
            String st = scanner.next();
            String[] strings = st.split("\\s+");

            System.out.println(compareHeights(
                    Integer.parseInt(strings[0]), Integer.parseInt(strings[1])));
        }
    }

    private static String compareHeights(int aHeight, int bHeight) {
        if(aHeight > bHeight) {
            return "A";
        }
        return "B";
    }
}
