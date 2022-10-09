package codechef;

import java.util.Scanner;

public class SizeSpace {
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

            System.out.println(fitsIn(
                    Integer.parseInt(strings[0]),
                    Integer.parseInt(strings[1]),
                    Integer.parseInt(strings[2])));
        }
    }

    private static String fitsIn(int totalSpace, int OneSpace, int TwoSpace) {
        if((OneSpace * 1) + (TwoSpace * 2) <= totalSpace) {
            return "YES";
        }
        return "NO";
    }
}
