//package AssiutSheet2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class SequenceAndSum {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        PrintWriter pw = new PrintWriter(System.out);
        String[] ss = fr.readLinesToArray();

        for (String s : ss) {
            int[] nums = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

            if (nums[0] <= 0 || nums[1] <= 0) {
                pw.flush();

                System.exit(0);
            }

            List<Integer> betweenNums = new ArrayList<>();

            for (int i = nums[0]; i <= nums[1]; i++) {

                betweenNums.add(i);
            }
            for (int num : betweenNums) {

                pw.print(num + " ");
            }
            long sum = betweenNums.stream().reduce(0, Integer::sum);
            pw.println("sum =" + sum);
            pw.flush();


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

        public String[] readLinesToArray() {

            List<String> lines = new ArrayList<>();
            String line;

            // Read lines until EOF or an empty line is entered (depending on your logic)
            try {

                while ((line = br.readLine()) != null && !line.isEmpty()) {
                    lines.add(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Convert the List to a String array
            return lines.toArray(new String[0]);
        }
    }
}
