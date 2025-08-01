//package AssiutSheet1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * D. Difference
 * time limit per test1 second
 * memory limit per test256 megabytes
 * Given four numbers A, B, C and D. Print the result of the following equation :
 *
 *  X = (A * B) - (C * D).
 *
 * Input
 * Only one line containing 4 separated numbers A, B, C and D ( - 105  ≤  A, B, C, D  ≤  105).
 *
 * Output
 * Print "Difference  =  " without quotes followed by the equation result.
 *
 * Examples
 * inputCopy
 * 1 2 3 4
 * outputCopy
 * Difference = -10
 */
public class Difference {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        PrintWriter pw = new PrintWriter(System.out);

        // Your solution logic goes here
        String s = fr.nextLine();
        String[] inputs = s.split(" ");
        long a = parseInt(String.valueOf(inputs[0]));
        long b = parseInt(String.valueOf(inputs[1]));
        long c = parseInt(String.valueOf(inputs[2]));
        long d = parseInt(String.valueOf(inputs[3]));

        long diff = (a*b) - (c*d);

        pw.println("Difference = " + diff);

        pw.flush();
        pw.close();
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
