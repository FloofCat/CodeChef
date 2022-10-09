package codechef;

import java.util.Scanner;

public class ShareChoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = scanner.nextInt();

        parseData(scanner, numberInput);
    }

    private static void parseData(Scanner scanner, int num) {
        for(int i = 0; i < num; i++) {
            scanner.useDelimiter("\n");
            String st = scanner.next();

            String[] strings = st.split(" ");

            System.out.println(sharable(
                    Integer.parseInt(strings[0]),
                    Integer.parseInt(strings[1])
            ));
        }
    }

    private static String sharable(int aChoc, int bChoc) {
        if((aChoc + bChoc) % 2 == 0) {
            return "YES";
        }
        return "NO";
    }
}
