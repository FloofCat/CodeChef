package codechef.sixtythree;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class MAKELENGTH1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0) {
            int n = sc.nextInt();
            String s = sc.next();

            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if(!stack.isEmpty() && stack.pop() == c) {
                    stack.pop();
                    stack.push('0');
                    continue;
                }

                stack.push(c);
            }


            while(!stack.isEmpty() && stack.pop() == '0') {
                stack.pop();
            }

            if(stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}