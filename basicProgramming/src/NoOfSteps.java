import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * LOGIC :--------------------------------------------------- - Get array size -
 * Get the array1 - Get the array2 - Get smallest num in array1 - Do for each
 * (i) ai = ai - bi (if ai >= bi) till u do not get an ai < num or ai = num -
 * count++ for every successful ai = bi after operation.
 * 
 * 
 * Required Updates :
 * replace the do-while loop with a while loop. it consumes extra time , for first unchecked iteration 
 */

public class NoOfSteps {
    public static void main(String[] args) throws IOException {
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bReader.readLine());
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        int arraySize = Integer.parseInt(st.nextToken());
        String[] inputArr1 = bReader.readLine().trim().split(" ");
        String[] inputArr2 = bReader.readLine().trim().split(" ");
     
        // casting out of range
        // int[] inputArr1 = new int[(int)arraySize];

        // array has a size limit
        // long[] inputArr1 = new long[(int) arraySize];

        // in this method of taking input everytime u need to hit enter
        // for (long i = 0; i < arraySize; i++) {
        // array1.add(Integer.parseInt(bReader.readLine()));
        // }

        for (String string : inputArr1) {
            array1.add(Integer.parseInt(string));
        }

        for (String string : inputArr2) {
            array2.add(Integer.parseInt(string));
        }
        // the minimum element might not be the min element of array 1 .
        // int num = Collections.min(array1);

        ArrayList<Integer> minList  =new ArrayList<>();
        for (int i = 0; i < arraySize; i++) {
            minList.add(array1.get(i) - array2.get(i));
        }

        int num = Collections.min(minList);
        int num2 = Collections.min(array1);
        int [] minsArr = {num2 ,num};
        // System.out.println(num + " num");
        int NoOfSteps = 0;
        int perIndexSteps = 0;

        for (int timka : minsArr) {

            for (int i = 0; i < arraySize; i++) {

                do {

                    if (array1.get(i) >= array2.get(i) && array1.get(i) > timka) {
                        array1.set(i, array1.get(i) - array2.get(i));
                        perIndexSteps++;
                    } else {
                        break;
                    }

                    // run till this expression is true
                } while (array1.get(i) >= timka);

                if (array1.get(i) < timka) {
                    NoOfSteps = 0;
                    break;
                } else {
                    NoOfSteps = NoOfSteps + perIndexSteps;
                }

                perIndexSteps = 0;

            }

            if (NoOfSteps != 0) {
                break;
            }

        }

        

        // System.out.println(NoOfSteps + " ans");
        System.out.println((NoOfSteps < 1) ? -1 : NoOfSteps);
    }
}

/**
 * LEARNT :---------------------------------------------------
 * 
 * 1. What happens if u try to cast a ranged long num ---> out of range int ??
 * 
 * Ans : 20000000000 Exception in thread "main"
 * java.lang.NegativeArraySizeException: -1474836480 at
 * NoOfSteps.main(NoOfSteps.java:28)
 * 
 * the cast will be successful but on reaching the range of int, what will
 * happen ?? - i think i re-iterates the int range for those extra long values ,
 * most likely in forward direction iteration again
 * 
 * 2. Java Array Maximum Size ??
 * 
 * Ans: As we use an int value to give the array its size while initializing
 * hence the range of an array becomes the positive border of int.
 * 
 * better use an arraylist if size of array in constraint ----exceeds int range
 * Still if ur arraylist stores data in long range then for getting any index
 * {index must be an int not a long}
 * https://stackoverflow.com/questions/459643/using-a-long-as-arraylist-index-in-java
 * Only sol is to write ur own data structure that takes long indices
 * 
 * 3. Java String Maximum Length ??? Ans: As we use ints for indexing in String
 * , hence Integer.MAX_INT is range of Strings in java
 * 
 * 4. Do not take multiple levels of I/O like taking a string input --> separating ---> storing in an arraylist 
 * 5. do not use do-while loop because it consumes extra time for first unchecked iteration that is inevitable 
 * 6. Use Do-While loops only when , u have to do the 1st iteration for must.
 * 
 */
