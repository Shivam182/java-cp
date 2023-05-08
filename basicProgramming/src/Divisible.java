import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 * LOGIC :----------------------------------- after performing question
*  DIVIDE THE NUM BY 11 MODULO IF ZERO --> OUI IF NOT ZERO ---> NON
 */

public class Divisible {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arraySize = Integer.parseInt(st.nextToken());
        String [] inpuArrayList = br.readLine().split(" ");
        
        int i = 0;
        StringBuilder reqNum = new StringBuilder("");
        for (String string : inpuArrayList) {
            
            if (i < inpuArrayList.length/2) {
                reqNum.append(string.substring(0,1));
                // System.out.println(string + " part-1");
            }

            if (i >= inpuArrayList.length/2) {
                reqNum.append(string.substring(string.length() - 1));
                // System.out.println(string + " part-2");

            }

            i++;
        }

        BigInteger bigInteger = new BigInteger(reqNum.toString());
        BigInteger eleven = new BigInteger("11");
        BigInteger ans = bigInteger.remainder(eleven);
        String finalAns = (ans.compareTo(BigInteger.ZERO) == 0)? "OUI":"NON";
        System.out.println(finalAns);

    }
}

/**
 * LEARNT :---------------------------------------------------------------------------------------------------------------
 * here in this u may get a digit whose length can be greater than 30 thousand because for every element in array 1 num ++
 * and long can store values at max 19 digits till.
 * so u can use BIG INTEGER CLASS in java.math package
 */
