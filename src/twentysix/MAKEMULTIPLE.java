package twentysix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class MAKEMULTIPLE {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for(int i = 0; i < num; ++i) {
            int x = 0;

            int[] input = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int a = input[0];
            int b = input[1];
            int backup = b * 2;

            while(true) {
                if((b) % (a) == 0) {
                    System.out.println("YES");
                    break;
                } else if (b >= backup) {
                    System.out.println("NO");
                    break;
                }

                ++b;
                ++a;
            }
        }
    }

    private static void parseData(int num, Scanner sc) {

    }
}
