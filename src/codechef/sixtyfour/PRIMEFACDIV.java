package codechef.sixtyfour;

import java.util.Scanner;

public class PRIMEFACDIV {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while(n-->0) {
           int x = sc.nextInt();
           int y = sc.nextInt();

           for(int i = 2; i < y; i++) {
                if(!isPrime(i)) {
                    continue;
                }

                if(y % i == 0 && x % i != 0) {
                    System.out.println("NO");
                    return;
                }
           }

           System.out.println("YES");
        }
    }

    public static boolean isPrime(int n) {
        int count = 0;
        if(n <= 1) {
            return false;
        }

        for(int i = 2; i<=n/2; i++) {
            if(n % i == 0) {
                count++;
            }
        }

        return count == 1;
    }
}
