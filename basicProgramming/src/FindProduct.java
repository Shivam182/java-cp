import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class FindProduct {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int arraySize = Integer.parseInt(st.nextToken());
        String[] arr = new String[arraySize];

        // for (int i = 0; i < arr.length; i++) {
        // // why it did not stop for taking user input for arr element , rather it
        // // shows NoSuchElementException
        // arr[i] = Integer.parseInt(st.nextToken());
        // }
        // ArrayList<Integer> arrayList = new ArrayList<>();
        // for (int i = 0; i < arr.length; i++) {
        // int m = Integer.parseInt(st.nextToken());
        // arr[i] = m;
        // }

        // arr = arrayString.split(" ");
        // this is better than above
        arr = br.readLine().split(" ");

        // take long instead of int because if multiplying huge numbers it can go out of
        // range
        Long product = 1L;

        for (int i = 0; i < arraySize; i += 2) {
            if (arraySize % 2 != 0) {

                if (i == arraySize - 1) {
                    product = (long) ((product * Integer.parseInt(arr[i])) % (Math.pow(10, 9) + 7));
                    break;
                }
            }

            product = (long) ((product * Integer.parseInt(arr[i]) * Integer.parseInt(arr[i + 1]))
                    % (Math.pow(10, 9) + 7));
        }

        System.out.println(product + " pr");

    }
}
