package twentysix;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FINALSUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i = 0; i < num; ++i) {
            int terms = sc.nextInt();
            int queries = sc.nextInt();
            int[] t = new int[terms];

            for(int a = 0; a < terms; ++a) {
                t[a] = sc.nextInt();
            }

            for(int b = 0; b < queries; ++b) {
                int startIndex = sc.nextInt();
                int endIndex = sc.nextInt();

                for (int x = startIndex - 1; x < endIndex; ++x) {
                    if ((x - startIndex + 1) % 2 == 0) {
                        ++t[x];
                    } else {
                        --t[x];
                    }
                }
            }

            System.out.println(Arrays.stream(t).sum());
        }
    }
}
