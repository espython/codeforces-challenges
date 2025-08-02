//package AssiutSheet1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class Calculator {
    record NumbersRecord(long x, long y) {
    }

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        PrintWriter pw = new PrintWriter(System.out);

        // Your solution logic goes here
        String s = fr.nextLine();

        if (s.contains("+")) {
            NumbersRecord n = calculate(s, "\\+");
            pw.println(n.x + n.y);
        } else if (s.contains("-")) {
            NumbersRecord n = calculate(s, "\\-");
            pw.println(n.x - n.y);
        } else if (s.contains("*")) {
            NumbersRecord n = calculate(s, "\\*");
            pw.println(n.x * n.y);
        }
        else if (s.contains("/")) {
            NumbersRecord n = calculate(s, "\\/");
            pw.println(n.x / n.y);
        }


        pw.flush();
        pw.close();
    }

    static NumbersRecord calculate(String s, String sign) {
        String[] split = s.split(sign);

        return new NumbersRecord(parseInt(split[0]), parseInt(split[1]));

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
