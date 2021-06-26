import java.io.*;
import java.util.*;

/**
 * LOGIC:------------------------------------
 * check input string's last char is 0 or not 
 */

public class Divisibility {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arrLen = Integer.parseInt(st.nextToken());
        String inpuString = br.readLine();

        String ans = (inpuString.charAt(inpuString.length() - 1) == '0') ? "Yes" : "No";
        System.out.println(ans);
        br.close();
    }
}

/**
 * LEARNT:---------------------------------------------------
 * char checking operations are much faster than string check
 * every condition check can take about 0.01 seconds
 * 
 * 
 * How does an online judge input giving system works ?? There
 * r many possible ways of taking input , using int array , 
 * string split array and might be more
 * methods then , how actually would online judge giving input
 * i think it simply runs the our code and according to the 
 * method of input used it gives input to our program
 * 
 */