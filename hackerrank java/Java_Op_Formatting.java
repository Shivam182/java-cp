import java.io.*;

public class Java_Op_Formatting {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
              String input = br.readLine().trim();
        String subString = input.substring(0,input.indexOf(" ")).trim();

        int intPart = Integer.parseInt(input.substring(input.indexOf(" ")).trim());
        System.out.printf("%-15s%03d%n",subString,intPart);
        }
        System.out.println("================================");

        
       
        



    }
}
