//package AssiutSheet2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class EvenOddPositiveNegative {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        PrintWriter pw = new PrintWriter(System.out);
        long l = fr.nextLong();
        String s = fr.nextLine();
        int[] numList = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        int post = 0;
        int neg = 0;
        int even = 0;
        int odd = 0;
        for (int n : numList) {
            if (n > 0) {
                post++;
            }
            if (n < 0) neg++;
            if (n % 2 == 0) even++;
            if (n % 2 != 0) odd++;


        }
        pw.println("Even: " + even);
        pw.println("Odd: " + odd);
        pw.println("Positive: " + post);
        pw.println("Negative: " + neg);

// 86294906 292379617 104468026
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
