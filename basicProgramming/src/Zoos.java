import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * LOGIC :------------------------------------------------------------------- -
 * Mehtod :1 {less effective}
 * count the number of Z's = x - sub x from string length = y {as it's said that
 * only write Z's and O's} - perform check Ans = (2 *x = y) ? "Yes":"No"
 * 
 * Method :2 { Better & Used One}
 * iterate for every string input array split("") , compare if equals z then x++ 
 * else y++ ; at last calculate the given test expression , use ternary operator 
 */

public class Zoos {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in),20);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = 0;
        int y = 0;
        String[] inpuString = st.nextToken().split("");
        for (String string : inpuString) {

            if (string.equalsIgnoreCase("z")) {
                x++;
            } else {
                y++;
            }
        }
        System.out.println(x + " " + y);

        String ans = (2 * x == y) ? "Yes" : "No";
        System.out.println(ans);
br.close();
    }
}

/**
 * LEARNT :------------------------------------------------------
 * 1. if u want to compare two string do not use == 
 *  instead use string.equals("anyStrVal") || string.equalsIgnoreCase("anyStrValue") 
 * 
 */
