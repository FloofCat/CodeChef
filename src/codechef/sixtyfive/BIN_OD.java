package codechef.sixtyfive;

import javax.swing.text.AttributeSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class BIN_OD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        while(a-->0) {
            int b = sc.nextInt();
            int c = sc.nextInt();

            int[] array = new int[b];
            int count = 0;

            while(b-->0) {
                array[count] = sc.nextInt();
                count++;
            }

            while(c-->0) {
                int k = sc.nextInt();

                int a1 = sc.nextInt();
                int b1 = sc.nextInt();

                int a2 = sc.nextInt();
                int b2 = sc.nextInt();

                List<List<Integer>> arg = new ArrayList<>();

                for(int i = a1; i <= b1; i++) {
                    for(int j = a2; j <= b2; j++) {
                        arg.add(Arrays.asList(i, j));
                        System.out.println(i + ". " + j);
                    }
                }

                int coun = 0;

                for(List<Integer> arr : arg) {
                    try {
                        String s = Integer.toBinaryString(array[arr.get(0) - 1]^array[arr.get(1) - 1]);
                        char ch = s.charAt(s.length() - k - 1);
                        if(String.valueOf(ch).equals("1")) {
                            coun++;
                        }

                    } catch (Exception e) {
                        continue;
                    }
                }

                System.out.println(coun);
            }
        }
    }
}
