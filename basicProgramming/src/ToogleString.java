import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * LOGIC :-------------------------------------- 
 * check the case , reverse the
 * case of every char
 * 
 * Better Soln : see the best submission of this question . 
 * 
 */

public class ToogleString {
    public static void main(String[] args) throws IOException {

        // WAIT !! Have u read again competitve text.
        // do all test cases correct in first attempt !!!

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char[] arr = st.nextToken().toCharArray();

        // char[] arr = in.toCharArray();
        // ArrayList<Character> auxArrayList = new ArrayList<>();
        char[] auxArray = new char[arr.length];
        int i = 0;
        for (char c : arr) {

            if (Character.isLowerCase(c)) {
                auxArray[i] = Character.toUpperCase(c);
                // auxArrayList.add();
            } else {
                // auxArrayList.add();
                auxArray[i] = Character.toLowerCase(c);
            }
            i++;
        }

        // can this be used to convert an array directly to other class array
        // Character[] arr1 = (Character[]) auxArrayList.toArray();
        String ans = new String(auxArray);
        System.out.println(ans);
    }
}

/**
 * LEARNT :--------------------------------------
 * 1. u can use a char[] to make a string not a Character[] 
 * 
 * 2. a list can be converted to an array using
 * list.toArray() but this will return an Object class array i,e Object[] ,
 *  if u try to print this Object array it will print simply ,
 *  but in order to use it as integer, u have to typecast
 * every element before usage .  
 */
