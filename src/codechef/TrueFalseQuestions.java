package codechef;

import java.util.Scanner;

public class TrueFalseQuestions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = scanner.nextInt();

        parseData(scanner, numberInput);
    }

    private static void parseData(Scanner scanner, int num) {
        for(int i = 0; i < num; i++) {
            scanner.useDelimiter("\n");
            String string = scanner.next();

            String[] strings = string.split(" ");

            System.out.println(getOppScore(
                    Integer.parseInt(strings[0]),
                    Integer.parseInt(strings[1])
            ));
        }
    }

    private static int getOppScore(int totalScore, int aMarks) {
        return totalScore - aMarks;
    }
}
