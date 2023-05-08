import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * LOGIC : Solve using recurssion
 */

public class Factorial {

    static int getFactorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * getFactorial(n - 1);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int input = Integer.parseInt(st.nextToken());
        System.out.println(getFactorial(input));
        // WAIT !! Have u read again competitve text.
        // do all test cases correct in first attempt !!
        // after this do basics of implementation -- before that complete learning
        // git commands revise
        // section's left things and revise java things more deep
    }

}

/**
 * LEARNT :
 * 
 */
