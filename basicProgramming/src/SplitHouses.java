import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.NoSuchElementException;
// import java.util.StringTokenizer;

/**
 * LOGIC : write input n between 1 to 20. write chars H and . and store in a
 * byte array of length 20. create a string from the byte array check if string
 * contsins "HH" print no else replce every dot char in the string by B char .
 * print the ans
 * 
 * Update: handle no such element exception, 
 *  we can limit to read only 20 chars for input2 ?
 */
public class SplitHouses {

    public static void main(String[] args) throws IOException {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in) ,20);
            // StringTokenizer st = new StringTokenizer(br.readLine());
            // int input1 = Integer.parseInt(st.nextToken());
            String input2 = br.readLine();
            if (input2.contains("HH")) {
                System.out.print("No");
            } else {
                if (input2.length() <= 20) {
                    System.out.println("Yes");
                    System.out.print(input2.replace('.', 'B'));
                }

            }

        } catch (NoSuchElementException e) {
            System.out.println("Ïnput Can't be Blank !! ");
        }

    }
}