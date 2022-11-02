package twentysix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class PYTHAGORAS {

    private static String st = "-1";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for(int i = 0; i < num; i++) {
            int h = Integer.parseInt(br.readLine());

            st = "-1";

            int x = (int) Math.round(Math.sqrt(h));

            for(int a = 0; a <= h; ++a) {
                int j = a / x;
                int k = a % x;

                if(j*j + k*k == h) {
                    st = j + " " + k;
                    break;
                }
            }

            System.out.println(st);
        }
    }
}
