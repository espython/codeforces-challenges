//package AssiutSheet1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

/**
 * S. Interval
 * time limit per test1 second
 * memory limit per test256 megabytes
 * Given a number X. Determine in which of the following intervals the number X belongs to:
 *
 * [0,25], (25,50], (50,75], (75,100]
 *
 * Note:
 *
 * if X belongs to any of the above intervals print "Interval " followed by the interval.
 * if X does not belong to any of the above intervals print "Out of Intervals".
 * The symbol '(' represents greater than.
 * The symbol ')' represents smaller than.
 * The symbol '[' represents greater than or equal.
 * The symbol ']' represents smaller than or equal.
 * For example:
 *
 * [0,25] indicates numbers between 0 and 25.0000, including both.
 *
 * (25,50] indicates numbers greater than 25: (25.00001) up to 50.0000000.
 *
 * Input
 * Only one line containing a number X ( - 1000 ≤ X ≤ 1000).
 *
 * Output
 * Print the answer to the problem above.
 */
public class Interval {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        PrintWriter pw = new PrintWriter(System.out);

        double x = fr.nextDouble();
        if (x>= 0 && x <= 25) {
            pw.println("Interval [0,25]");
        } else if (x > 25 && x <= 50) {
            pw.println("Interval (25,50]");
        } else if (x > 50 && x <= 75) {
            pw.println("Interval (50,75]");
        } else if (x > 75 && x <= 100) {
            pw.println("Interval (75,100]");
        } else pw.println("Out of Intervals");


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
            return parseDouble(next());
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
