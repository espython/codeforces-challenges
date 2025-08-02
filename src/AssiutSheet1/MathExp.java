//package AssiutSheet1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class MathExp {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        PrintWriter pw = new PrintWriter(System.out);
        long n1 = fr.nextLong();
        String sign = fr.next();
        long n2 = fr.nextLong();
        String eq = fr.next();
        long result = fr.nextLong();
        final String plus = "+";
        final String minus = "-";
        final String mult = "*";

        switch (sign){
            case plus :
                if(n1 + n2 == result){
                    pw.println("Yes");
                }else pw.println(n1+n2);
                break;
            case minus :
                if(n1 - n2 == result){
                    pw.println("Yes");
                }else pw.println(n1-n2);
                break;
            case mult :
                if(n1 * n2 == result){
                    pw.println("Yes");
                }else pw.println(n1*n2);
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
