package CsesIntroductory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class MissingNumber {
    /**
     *
     * You are given all numbers between 1,2,...,n except one. Your task is to find the missing number.
     * Input
     * The first input line contains an integer n.
     * The second line contains n-1 numbers. Each number is distinct and between 1 and n (inclusive).
     * Output
     * Prints the missing number.
     * Constraints
     * <p>
     * 2 \le n \le 2 \cdot 10^5
     * <p>
     * Example
     * Input:
     * 5
     * 2 3 1 5
     * <p>
     * Output:
     * 4
     */

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        PrintWriter pw = new PrintWriter(System.out);

        int n = fr.nextInt();
        
        // Calculate expected sum using formula: n * (n + 1) / 2
        long expectedSum = (long) n * (n + 1) / 2;
        long actualSum = 0;
        
        // Read and sum all given numbers
        for (int i = 0; i < n - 1; i++) {
            actualSum += fr.nextInt();
        }
        
        // The missing number is the difference
        pw.println(expectedSum - actualSum);

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
            return Integer.parseInt(next());
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