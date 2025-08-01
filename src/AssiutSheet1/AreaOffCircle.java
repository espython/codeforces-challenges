//package AssiutSheet1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * E. Area of a Circle
 * time limit per test1 second
 * memory limit per test256 megabytes
 * Given a number R calculate the area of a circle using the following formula:
 * <p>
 * Area = π * R2.
 * <p>
 * Note: consider π = 3.141592653.
 * <p>
 * Input
 * Only one line containing the number R (1  ≤  R  ≤  100).
 * <p>
 * Output
 * Print the calculated area, with 9 digits after the decimal point.
 */
public class AreaOffCircle {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        PrintWriter pw = new PrintWriter(System.out);
        double pi = 3.141592653;
        // Your solution logic goes here
        double r = fr.nextDouble();


        double area = pi * r * r;
        String roundedValue = String.format("%.9f", area);
        pw.println(roundedValue);

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
