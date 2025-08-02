//package AssiutSheet1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class CoordinatesOfPoint {


    public static void main(String[] args) {
        FastReader fr = new FastReader();
        PrintWriter pw = new PrintWriter(System.out);
        /**
         * Print Q1, Q2, Q3, Q4 according to the quarter in which the point belongs to.
         * Print "Origem" If the point is at the origin.
         * Print "Eixo X" If the point is over X axis.
         * Print "Eixo Y" if the point is over Y axis.
         */

        // Your solution logic goes here

        double x = fr.nextDouble();
        double y = fr.nextDouble();
        if (x == 0 && y == 0) {
            pw.println("Origem");
        } else if (x == 0) {
            pw.println("Eixo X");
        } else if (y == 0) {
            pw.println("Eixo Y");
        } else if (x > 0 && y > 0) {
            pw.println("Q1");
        } else if (x < 0 && y > 0) {
            pw.println("Q2");
        }else if (x < 0 && y < 0) {
            pw.println("Q3");
        }
        else if (x > 0 && y < 0) {
            pw.println("Q4");
        }


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
