//package AssiutContest2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

import static java.lang.Double.POSITIVE_INFINITY;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import static java.lang.Math.min;

public class FindingMinimums {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        PrintWriter pw = new PrintWriter(System.out);
        int a = fr.nextInt();
        int size = fr.nextInt();
        String s = fr.nextLine();
        List<Long> nums = Arrays.stream(s.split(" ")).map(Long::parseLong).toList();
        List<List<Long>> subNums = new ArrayList<>();
        if(size == 1){
            for (long n : nums) {
                pw.print(n + " ");
            }
        }else {

            for (int i = 0; i < nums.size(); i = i + size) {

                if (i + size < nums.size() - 1) {
                    subNums.add(nums.subList(i, i + size));
                } else {
                    subNums.add(nums.subList(i, nums.size()));
                }
            }

            for (List<Long> sub : subNums) {
                long minElement = (long) POSITIVE_INFINITY;
                for (long n : sub) {
                    minElement = Long.min(n, minElement);
                }
                pw.print(minElement + " ");

            }
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
