//package AssiutSheet1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.Integer.*;

public class MaxAndMin {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        PrintWriter pw = new PrintWriter(System.out);

        // Your solution logic goes here
        String s = fr.nextLine();
        long[] a = Arrays.stream(s.split(" ")).mapToLong(Integer::parseInt).toArray();

        long max = MIN_VALUE;
        long min = MAX_VALUE;

        for(long n : a){
            max = Math.max(n,max);
            min = Math.min(n,min);
        }
        pw.println(String.format("%d %d",min,max));
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
