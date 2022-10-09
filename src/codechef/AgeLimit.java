package codechef;

import java.util.Scanner;

public class AgeLimit {
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

            System.out.println(checkEligible(
                    Integer.parseInt(strings[0]),
                    Integer.parseInt(strings[1]),
                    Integer.parseInt(strings[2])
            ));
        }
    }

    private static String checkEligible(int low, int high, int age) {
        if(age >= low && age < high) {
            return "YES";
        }
        return "NO";
    }
}
