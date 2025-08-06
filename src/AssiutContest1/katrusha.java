// Wrong solution
package AssiutContest1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class katrusha {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        PrintWriter pw = new PrintWriter(System.out);

        long eyes = fr.nextLong();
        long mouths = fr.nextLong();
        long bodies = fr.nextLong();
        /**
         *
         Two eyes and one body.
         Two eyes, one mouth, and one body.
         One eye, one mouth, and one body.
         */
        long kat1  = Math.min(eyes/2 , bodies);
        long kat3 = Math.min(eyes,Math.min( mouths , bodies));
        pw.println(kat1 + "  " +  " " + kat3 );
        pw.println(Math.max(kat3,kat1));

        pw.flush();
        pw.close();
    }

    // 34688642 -851839419 395784949 490743112
    public static void printMessage(PrintWriter pw, String msg) {
        pw.println(msg);
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
