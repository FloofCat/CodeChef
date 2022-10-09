package codechef;

import java.util.Scanner;

public class RankerPage {

    private static int PARTICIPANT = 25;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numInput = scanner.nextInt();

        parseData(scanner, numInput);
    }

    private static void parseData(Scanner scanner, int num) {
        for(int i = 0; i < num; i++) {
            int rank = scanner.nextInt();

            System.out.println(String.valueOf((int) getPage(rank)));
        }
    }

    private static double getPage(int rank) {
        if(rank % 25 == 0) {
            return Math.floor((float) rank / PARTICIPANT);
        }
        return Math.floor((float) rank / PARTICIPANT) + 1;
    }
}
