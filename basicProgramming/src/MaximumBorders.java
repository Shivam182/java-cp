import java.io.*;
import java.util.*;

/**
 * FAILED AND COMPLEX CODE
 */

public class MaximumBorders {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().strip());
        try {

            int testCases = Integer.parseInt(st.nextToken());
            for (int i = 0; i < testCases; i++) {

                String matrixDimensions = br.readLine().strip();
                int indexof = matrixDimensions.indexOf(" ");

                int primarySize = Integer.parseInt(matrixDimensions.substring(0, indexof));
                int secondarySize = Integer.parseInt(matrixDimensions.substring(indexof + 1));
                BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in), secondarySize);
                char[][] arr = new char[primarySize][secondarySize];
                for (int j = 0; j < primarySize; j++) {
                    String charsString = br1.readLine().trim();
                    int jm = 0;
                    for (char c : charsString.toCharArray()) {
                        if (jm < secondarySize) {
                            arr[j][jm++] = c;
                        } else {
                            break;
                        }
                    }
                }

                int topBoundary = 0;
                int bottomBoundaryele = 0;

                Set<Integer> arr1 = new HashSet<>();
                Set<Integer> tempSet = new HashSet<>();
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> bottomBoundary = new ArrayList<>();

                for (int j = 0; j < primarySize; j++) {
                    for (int j2 = 0; j2 < secondarySize; j2++) {
                        if (arr[j][j2] == '#') {
                            if (j2 == 0) {
                                arrayList.add(j2);
                            } else if (j2 >= 1 && arr[j][j2 - 1] == '.') {
                                arrayList.add(j2);
                            }
                        }
                    }

                    for (int j2 = 0; j2 < arrayList.size(); j2++) {
                        int startFrom = arrayList.get(j2);
                        for (int k = startFrom; k < secondarySize; k++) {
                            if (arr[j][k] == '#') {
                                arr1.add(k);
                                topBoundary++;
                            } else {
                                break;
                            }
                        }
                        for (int k = j + 1; k < primarySize; k++) {
                            for (Integer integer : arr1) {
                                if (arr[k][integer] == '#') {
                                    for (int l = integer; l >= 0; l--) {
                                        // left itr
                                        if (arr[k][l] == '#') {
                                            tempSet.add(l);

                                        } else {
                                            break;
                                        }
                                    }

                                    for (int l = integer + 1; l < secondarySize; l++) {
                                        // right itr
                                        if (arr[k][l] == '#') {
                                            tempSet.add(l);

                                        } else {
                                            break;
                                        }
                                    }

                                    if (tempSet.size() != 0) {
                                        bottomBoundaryele = tempSet.size();
                                    }

                                }
                            }
                            arr1.clear();
                            arr1.addAll(tempSet);
                            tempSet.clear();

                        }
                        bottomBoundary.add(bottomBoundaryele);
                        bottomBoundary.add(topBoundary);
                        topBoundary = 0;
                    }

                    arr1.clear();
                    arrayList.clear();
                }
                System.out.println(Collections.max(bottomBoundary) + " bottom boundary ");
            }
        } catch (NoSuchElementException e) {
            System.out.println("Input Cannot Be Blank !! ");
        }
    }
}