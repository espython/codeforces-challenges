//package AssiutSheet1;

//package CsesIntroductory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class SimpleCalc {


    public static void main(String[] args) {
        FastReader fr = new FastReader();
        PrintWriter pw = new PrintWriter(System.out);

        // Your solution logic goes here
        String s = fr.nextLine();
        String[] inputs = s.split(" ");
        long x = parseInt(String.valueOf(inputs[0]));
        long y = parseInt(String.valueOf(inputs[1]));

        pw.println(x + " + " + y + " = " + (x+y));
        pw.println(x + " * " + y + " = " + (x*y));
        pw.println(x + " - " + y + " = " + (x-y));

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



