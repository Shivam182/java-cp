import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * LOGIC :
 * simple verifying logic 
 * sum verifying logic further 
 * 
 * ques demands to add int + '-' 
 * I don't understand how a soldier can perofrm this calculation : 7 + '-' = 52 
 */

public class AliAndHelpingInnocentPeople {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String inpuString = st.nextToken();
        boolean finalAns = true;

        ArrayList<Character> arrayList = new ArrayList<>();
        arrayList.add('A');
        arrayList.add('E');
        arrayList.add('I');
        arrayList.add('O');
        arrayList.add('U');
        arrayList.add('Y');

        char charCheck = inpuString.charAt(2);
        int sum = 0;
        if (arrayList.contains(charCheck) == false) {

            int aux = 1;

            for (int j = 0; j < 9; j++) {

                if (j == 5) {

                    if (Integer.parseInt(inpuString.substring(j, j + 1)) % 2 != 0) {
                        finalAns = false;
                        break;
                    }

                }

                if (aux == 3) {
                    if (sum % 2 != 0) {
                        finalAns = false;
                        break;
                    }
                    sum = 0;
                    aux = 1;
                }

                if (j != 2 && j != 6 && j != 5) {
                    sum = sum + Integer.parseInt(inpuString.substring(j, j + 1));
                    aux++;
                }
            }
        } else {
            finalAns = false;
        }

        String ans = (finalAns) ? "valid" : "invalid";
        System.out.println(ans);

    }
}

/**
 * LEARNT :-------------------------------------------------
 * 
 */