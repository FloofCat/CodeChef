package codechef.sixtyfour;

import java.util.Scanner;
import java.util.Stack;

public class DISTINCTCOL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        while(a-->0) {
            int size = sc.nextInt();

            Stack<Integer> max = new Stack<>();

            for(int i = 0; i < size; i++) {
                int x = sc.nextInt();

                if(max.isEmpty()) {
                    max.push(x);
                } else if(max.peek() < x) {
                    max.pop();
                    max.push(x);
                }
            }

            System.out.println(max.pop());
        }
    }
}
