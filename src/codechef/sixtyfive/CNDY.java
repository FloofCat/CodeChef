package codechef.sixtyfive;

import java.util.HashMap;
import java.util.Scanner;

public class CNDY {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while(n-->0) {
            int a = sc.nextInt();
            int b = a*2;
            boolean flag = false;

            HashMap<Integer, Integer> countVar = new HashMap<>();

            while(b-->0) {
                int c = sc.nextInt();

                if(countVar.containsKey(c)) {
                    countVar.put(c, countVar.get(c) + 1);
                } else {
                    countVar.put(c, 1);
                }
            }

            for(int x : countVar.keySet()) {
                if(countVar.get(x) > 2) {
                    flag = false;
                    break;
                }

                flag = true;
            }

            if(flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
