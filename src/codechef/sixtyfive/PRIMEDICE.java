package codechef.sixtyfive;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PRIMEDICE {

    private static List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while(n-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(primes.contains((a+b))) {
                System.out.println("Alice");
            } else {
                System.out.println("Bob");
            }
        }
    }
}
