package codechef.sixtythree;

import java.util.Scanner;

public class TASTEDEC {

    private static int CHOCOLATE = 2;
    private static int CANDY = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0) {
            int CHOCO = sc.nextInt() * CHOCOLATE;
            int CAN = sc.nextInt() * CANDY;

            if(CHOCO > CAN) {
                System.out.println("Chocolate");
            } else if (CHOCO == CAN) {
                System.out.println("Either");
            } else {
                System.out.println("Candy");
            }
        }
    }
}
