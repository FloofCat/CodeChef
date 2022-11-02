package codechef.sixtythree;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class AVDSQUARPLZ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0) {
            int x = sc.nextInt();

            LinkedList<Integer> usedInts = new LinkedList<>();

            for(int i = x; i > 0; i--) {
                /*if(usedInts.contains(i)) {
                    continue;
                }

                if(i == 1) {
                    break;
                }

                if(i - 2 >= 1) {
                    usedInts.add(i);
                    usedInts.add(i-2);
                } else if (usedInts.contains(i-1)){
                    usedInts.add(i);
                } else {
                    usedInts.add(i);
                    usedInts.add(i-1);
                }*/

                usedInts.add(i);
            }

            String print = "";
            for(Integer j : usedInts) {
                print = print + j + " ";
            }

            System.out.println(print.trim());
        }
    }
}
