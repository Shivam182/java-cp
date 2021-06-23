import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import javax.swing.ListModel;

/**
 * 
 * Logic : Get ArraySize Input Get array input separated by spaces get the index
 * of max element in the array
 * check if sum of all elements is greater than indexMax element or not , if
 * indexMax is max then make that index best index -- this will solve the last
 * index check problem else if --: if indexMax lies after the mid element -->>
 * then use symmetric index in other side if indexMax lies before the mid
 * element -->> 0 will be the best index.
 * what if ques contains neg numbers. 
 * 
 */

public class BestIndex {

    static long calSum(ArrayList<Integer> list) {

        long maxSum = 0L;
        Map<Integer, Long> arrayList = new HashMap<>();

        for (Integer integer : list) {

            int n1 = list.indexOf(integer);
            int n = n1;
            int a = 2 + n1;
            int d = 1;
            int d1 = 3;

            for (int i = n1; i < list.size(); i++) {


                // FAILED CODE : I WANT TO CHECK THE AT PARTICULAR CHECKPOINTS WHERE NEXT GROUP MUST EXIST ALREADY 
                // AND THE GROUPS FORM A SERIES , AND THEIR DIFF IS IN AP , I TRIED WITH WRITING NTH TERM , BUT 
                // STILL NEEDS WORK !! figure out what problem is coming up . 
                
                try {

                    maxSum = maxSum + list.get(i);
                    int checkPoint = a + (n - 1) / 2 * (2 * d1 + (n - 2) * d);
                    list.get(checkPoint);
                    
                    if (i == checkPoint) {
                        n++;
                    }

                } catch (IndexOutOfBoundsException e) {
                    break;
                }

            }
            arrayList.put(n1, maxSum);
            maxSum = 0;
        }

        System.out.println(arrayList);
        return (0);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bReader.readLine());

        int arraySize = Integer.parseInt(stringTokenizer.nextToken());
        String[] arrayString = bReader.readLine().trim().split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for (String string : arrayString) {
            list.add(Integer.parseInt(string));
        }

        System.out.println(calSum(list));
    }
}
