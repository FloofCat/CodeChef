package codechef.sixtyfour;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class DIVIDEMAKEEQ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0) {
            int size = sc.nextInt();

            int[] list = new int[size];
            int count2 = 0;

            while(size-->0) {
                int a = sc.nextInt();
                list[count2] = a;
                count2++;
            }

            int gcd = findGCD(list);
            int count = 0;
            for(int i : list) {
                if(i == gcd) {
                    continue;
                }

                count++;
            }

            System.out.println(count);
        }
    }

    public static int findGCD(int[] array) {
        int result = array[0];

        for(int i : array) {
            result = gcd(Math.min(result, i), Math.max(result, i));

            if(result == 1) {
                return 1;
            }
        }
        return result;
    }

    public static int gcd(int a, int b) {
        if(a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
}
