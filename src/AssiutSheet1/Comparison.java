//package AssiutSheet1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Comparison {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        PrintWriter pw = new PrintWriter(System.out);
        long n1 = fr.nextLong();
        String sign = fr.next();
        long n2 = fr.nextLong();
        final String gt = ">";
        final String lt = "<";
        final String equal = "=";

        switch (sign){
            case gt :
                if(n1 > n2){
                    pw.println("Right");
                }else pw.println("Wrong");
                break;
            case lt :
                if(n1 < n2){
                    pw.println("Right");
                }else pw.println("Wrong");
                break;
            case equal :
                if(n1 == n2){
                    pw.println("Right");
                }else pw.println("Wrong");
                break;
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
