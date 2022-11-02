package onestar;

import java.util.Scanner;

public class FLOW010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numInput = sc.nextInt();

        parseData(sc, numInput);
    }

    private static void parseData(Scanner scanner, int num) {
        for(int i = 0; i < num; i++) {
            String s = scanner.next();
            s = s.toLowerCase();

            getCate(s);
        }
    }

    private static void getCate(String s) {
        switch(s) {
            case "b":
                System.out.println("BattleShip");
                break;
            case "c":
                System.out.println("Cruiser");
                break;
            case "d":
                System.out.println("Destroyer");
                break;
            case "f":
                System.out.println("Frigate");
                break;
        }
    }
}
