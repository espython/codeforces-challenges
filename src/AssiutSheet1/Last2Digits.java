//package AssiutSheet1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.*;

public class Last2Digits {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        PrintWriter pw = new PrintWriter(System.out);
        long l1 = fr.nextLong();
        long r1 = fr.nextLong();
        long l2 = fr.nextLong();
        long r2 = fr.nextLong();

        BigInteger result = BigInteger.valueOf(l1)
                .multiply(BigInteger.valueOf(r1))
                .multiply(BigInteger.valueOf(l2))
                .multiply(BigInteger.valueOf(r2));

        // Get last 2 digits
        BigInteger lastTwoDigits = result.remainder(BigInteger.valueOf(100));
        if (lastTwoDigits.compareTo(BigInteger.valueOf(10)) < 0) {
            pw.println("0" + lastTwoDigits); // Add leading zero if needed
        } else {
            pw.println(lastTwoDigits);
        }


//        434500145 147276606 217842775 236387740

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
