import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

import java.util.StringTokenizer;

/**
 * 
 * Logic :--------------------------------------------------------------------
 * Get ArraySize Input , Get array input separated by spaces
 * 
 * MEHTOD -1 {Failed} get the index of max element in the array check if sum of
 * all elements is greater than indexMax element or not , if indexMax is max
 * then make that index best index -- this will solve the last index check
 * problem else if --: if indexMax lies after the mid element -->> then use
 * symmetric index in other side if indexMax lies before the mid element -->> 0
 * will be the best index. what if ques contains neg numbers.
 * 
 * METHOD -2 {Successful} identify checkpoints where u need to check for next
 * group series of checkpoints is a series whose diff is an AP. if green signal
 * for nxt group present iterate in list more and keep adding {else break;} use
 * long instead of ints & use auxillary array instead of In-Program calculation
 * of checkpoint
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

/**
 * Learnt :-----------------------------------------------------------------
 * 
 * 1. indexOf method fails to give correct indexes of duplicate elements : for
 * getting perfect indexes , using a loop iteration , better use an auxilliary
 * var = 0 and do it ++ var is the index of any particular element being
 * iterated
 * 
 * 2. Collections.sort() : sorts a number list in Ascending Order i,e natural
 * Ordering Collections.reverseOrder() as a second param in .sort() method to
 * get descending , Collections.reverseOrder -- > returns an Object of
 * Comparator class.
 * 
 * 3. while writing maths formulas in code , place the divide at end of the max
 * possible expression not embedded in between
 * 
 * 4. If u are bound to use some formula , try to use it such that it not gets
 * called multiple times and also inbetween running program this eats up all the
 * time, if not bound then use caching , instead of calculating IN-Program.
 * 
 */