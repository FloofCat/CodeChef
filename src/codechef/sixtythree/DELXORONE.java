package codechef.sixtythree;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class DELXORONE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-->0) {
            int a = sc.nextInt();
            int sum = a;

            LinkedList<Integer> list = new LinkedList<>();
            while(a-->0) {
                int x = sc.nextInt();
                list.add(x);
            }

            for(int i = 0; i < list.size() - 1; i++) {
                int xor = list.get(i) ^ list.get(i+1);
                if(xor <= 1) {
                    continue;
                }

                // Check previous terms too
                list.remove(list.get(i));
                if(i == 0) {
                    i--;
                    continue;
                }

                if ((list.get(i) ^ list.get(i-1)) > 1) {
                    list.remove(list.get(i-1));
                    i-=2;
                    continue;
                }

                i--;
            }

            System.out.println(sum - list.size());
        }
    }
}
