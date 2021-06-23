import java.io.BufferedReader;
import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.HashMap;
// import java.util.Map;
// import java.util.StringTokenizer;

import java.io.*;

/**
 * LOGIC : for each index element of input string , get number of segments and
 * add to global segments variable then finally using total segments. if total
 * segemnts = even then divide then by 2 {coz that's smallest num = 1, of
 * segments req to step up a place value } so if total = 6 .... largest num is
 * 111. if total is odd , then divide by 2 . and get ans , then write ans-2 no.s
 * of 1, when u r left with 4 segments , max is number 4.
 * 
 * - check for long numbers - reverse the odd string cases
 */

public class SevenSegDisplay {

    public static int numOfSegments(int num) {
        int ans = 3;

        /**
         * Note : WHILE USING LOGICAL if u use logical '&' , '|' with numbers then u
         * will get the binary solved answer of the operation
         */
        switch (num) {
            case 0:
                ans = 6;
                break;
            case 1:
                ans = 2;
                break;
            case 2:
            case 3:
                ans = 5;
                break;

            case 4:
            case 5:
            case 6:
                ans = num;
                break;

            case 8:
                ans = 7;
                break;
            case 9:
                ans = 6;
                break;
        }
        return (ans);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        // why i did not used string tokenizer : after one complete iteration of a test
        // case , we use to return and call again st object's nextToken Method , and as
        // it has already iterated it shows no such element exception and i don't know
        // how to refresh it

        // StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<String> aList = new ArrayList<>();
        for (int i = 0; i < input; i++) {
            String inpuString[] = br.readLine().trim().split("");

            Long totalSegments = 0L;
            for (String string : inpuString) {

                // when we ad int + long ans comes in long
                totalSegments = totalSegments + numOfSegments(Integer.parseInt(string));
            }

            // System.out.println(totalSegments + " total segments");

            StringBuilder TempAns = new StringBuilder();
            for (int j = 0; j < totalSegments / 2; j++) {
                if (totalSegments % 2 == 0) {
                    TempAns.append('1');
                } else {
                    if (j == (totalSegments / 2) - 1) {
                        TempAns.append('7');
                        TempAns.reverse();
                        break;
                    }
                    TempAns.append('1');
                }
            }
            // donot give ans everytime , take all test cases input solve store in an array
            // then print the arrayy finallly
            // System.out.println(TempAns + " final answer ");

            aList.add(TempAns.toString());
        }

        for (String integer : aList) {
            System.out.println(integer);
        }

    }
}
