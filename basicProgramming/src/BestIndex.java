import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import java.util.StringTokenizer;

/**
 * 
 * Logic : Get ArraySize Input Get array input separated by spaces get the index
 * of max element in the array check if sum of all elements is greater than
 * indexMax element or not , if indexMax is max then make that index best index
 * -- this will solve the last index check problem else if --: if indexMax lies
 * after the mid element -->> then use symmetric index in other side if indexMax
 * lies before the mid element -->> 0 will be the best index. what if ques
 * contains neg numbers.
 * 
 * 
 * 
 */

public class BestIndex {

    static long calSum(ArrayList<Integer> list) {

        long maxSum = 0L;
        // Map<Integer, Long> arrayList = new HashMap<>();
        ArrayList<Long> maxsList = new ArrayList<>();
            int index = 0;
        for (Integer integer : list) {

            // while using indexOf if u have same elements in list then it will give index
            // of first fetched element
            int n1 = index;
            
            
            System.out.println(n1 + " index");
            int a = 2 + n1;
            int d = 1;
            int d1 = 3;
            int t = 1;
            int checkPoint = n1;
            for (int i = n1; i < list.size(); i++) {

                // FAILED CODE : I WANT TO CHECK THE AT PARTICULAR CHECKPOINTS WHERE NEXT GROUP
                // MUST EXIST ALREADY
                // AND THE GROUPS FORM A SERIES , AND THEIR DIFF IS IN AP , I TRIED WITH WRITING
                // NTH TERM , BUT
                // STILL NEEDS WORK !! figure out what problem is coming up .

                /***
                 * PROBLEMS : 1. whie writing maths formulas in code , if u have any divide ,
                 * then try to put that divide at last wrapping the whole expression which is
                 * getting divided do not include divides in between
                 */
                try {

                    maxSum = maxSum + list.get(i);

                    if (i == checkPoint || i == n1) {

                        checkPoint = a + ((t - 1) * (2 * d1 + (t - 2) * d)) / 2;
                        list.get(checkPoint);
                        t++;
                    }

                } catch (IndexOutOfBoundsException e) {
                    break;
                }

            }

            maxsList.add(maxSum);
            maxSum = 0;
            index++;
        }

        // System.out.println();
        return (Collections.max(maxsList));
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
