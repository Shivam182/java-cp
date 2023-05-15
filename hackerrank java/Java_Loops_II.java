import java.io.*;

public class Java_Loops_II {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        

        // Main Loop:
        for (int i = 0; i < testCases; i++) {
            String input = br.readLine();
            int a = Integer.parseInt(input.split(" ")[0]);
            int b  = Integer.parseInt(input.split(" ")[1]);
            int n = Integer.parseInt(input.split(" ")[2]);

            int tempRes = a;
            int ans[] = new int[n];


            // Generate Expression
            for (int j = 0; j < n; j++) {
                int m = (int)Math.pow(2, j);
                ans[j] = tempRes + m*b;
                tempRes = ans[j];

            }

            // Print Result
            
            for (int j : ans) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
