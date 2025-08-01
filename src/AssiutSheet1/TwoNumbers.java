//package AssiutSheet1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class TwoNumbers {

    record NumbersRecord(double floor, double ceil, double round) {
    }

    ;

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        PrintWriter pw = new PrintWriter(System.out);
        // Your solution logic goes here
        String s = fr.nextLine();
        double n1 = parseDouble(s.split(" ")[0]);
        double n2 = parseDouble(s.split(" ")[1]);
        NumbersRecord numbers = calcFloorCeilRound(n1, n2);
        pw.println(formatOutput("floor", (long)n1, (long) n2, (long) numbers.floor));
        pw.println(formatOutput("ceil", (long) n1, (long) n2, (long) numbers.ceil));
        pw.println(formatOutput("round", (long) n1, (long) n2, (long) numbers.round));

        pw.flush();
        pw.close();
    }

    public static NumbersRecord calcFloorCeilRound(double n1, double n2) {
        double floor = Math.floor(n1 / n2);
        double ceil = Math.ceil(n1 / n2);
        double round = Math.round(n1 / n2);

        return new NumbersRecord(floor, ceil, round);


    }

    public static String formatOutput(String type, long n1, long n2, long output) {
        return String.format("%s %d / %d = %d", type, n1, n2, output);
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
