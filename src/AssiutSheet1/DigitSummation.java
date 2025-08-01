package AssiutSheet1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import static java.lang.Integer.parseInt;


/**
 * F. Digits Summation
 * time limit per test0.25 seconds
 * memory limit per test64 megabytes
 * Given two numbers N and M. Print the summation of their last digits.
 *
 * Input
 * Only one line containing two numbers N, M (0 ≤ N, M ≤ 1018).
 *
 * Output
 * Print the answer of the problem.
 *
 * Example
 * inputCopy
 * 13 12
 * outputCopy
 * 5
 * Note
 * First Example :
 *
 * last digit in the first number is 3 and last digit in the second number is 2.
 *
 * So the answer is: (3 + 2 = 5)
 */

public class DigitSummation {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        PrintWriter pw = new PrintWriter(System.out);
        // Your solution logic goes here
        String s = fr.nextLine();
        String[] list = Arrays.stream(s.split(" ")).toArray(String[]::new);
        String d1 = list[0];
        String d2 = list[1];

        pw.println(sumLastDigits(d1, d2));




        pw.flush();
        pw.close();
    }

    public static int sumLastDigits(String d1, String d2){
        String d1s = d1.substring(d1.length() -1);
        String d2s = d2.substring(d2.length()-1);

        return Integer.parseInt(d1s) + Integer.parseInt(d2s);
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
