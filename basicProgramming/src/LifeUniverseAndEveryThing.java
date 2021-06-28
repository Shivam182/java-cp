import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * LOGIC :
 * 
 */

public class LifeUniverseAndEveryThing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        int check = 1;
        ArrayList<Integer> a = new ArrayList<>();
        while (check != 42) {
           
                // a.add(Integer.parseInt(br.readLine()));
                check = Integer.parseInt(br.readLine());
                a.add(check);
           
        }

        a.remove(a.size()-1);
        for (Integer integer : a) {
            System.out.println(integer);

        }
        // WAIT !! Have u read again competitve text.
        // do all test cases correct in first attempt !!
    }
}

/**
 * LEARNT :
 * 
 */
