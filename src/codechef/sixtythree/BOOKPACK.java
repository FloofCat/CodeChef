package codechef.sixtythree;

import java.util.Scanner;

public class BOOKPACK {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0) {
            int shelves = sc.nextInt();
            int books = sc.nextInt();
            int box = sc.nextInt();

            if(books % box == 0) {
                System.out.println(books / box * shelves);
            } else if (books < box) {
                System.out.println(shelves);
            } else {
                System.out.println((Math.round(books / box) + 1) * shelves);
            }

        }
    }
}
