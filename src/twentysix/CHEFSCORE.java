package twentysix;

import java.util.Scanner;

public class CHEFSCORE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        parseData(num, sc);
    }

    private static void parseData(int num, Scanner s) {
        for(int i = 0; i < num; i++) {
            int problems = s.nextInt();
            int scorePer = s.nextInt();
            int wanted = s.nextInt();

            boolean confirm = false;

            for(int j = 0; j <= problems; j++) {
                if(scorePer * j == wanted) {
                    confirm = true;
                    break;
                } else {
                    confirm = false;
                    continue;
                }
            }

            if(confirm) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
