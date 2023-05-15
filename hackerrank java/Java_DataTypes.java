import java.io.*;

public class Java_DataTypes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCases; i++) {

            String str = br.readLine();
            try {

                long input = Long.parseLong(str);

                if (input <= 127 & input >= -128) {
                    // can be fitted in byte , short , int , long
                    System.out.println(input + " can be fitted in:");
                    System.out.println("* byte\n* short\n* int\n* long");
                    continue;
                }

                // -32768 to 32767
                if (input <= 32767 & input >= -32768) {
                    // can be fitted into short , int , long
                    System.out.println(input + " can be fitted in:");
                    System.out.println("* short\n* int\n* long");
                    continue;
                }

                // -2147483648 to 2147483647
                if (input <= 2147483647 & input >= -2147483648) {
                    // can be fitted into int , long
                    System.out.println(input + " can be fitted in:");
                    System.out.println("* int\n* long");
                    continue;
                }

                // -9223372036854775808 to 9223372036854775807
                if (input <= 9223372036854775807l & input >= -9223372036854775808l) {
                    // can only be fitted into long
                    System.out.println(input + " can be fitted in:");
                    System.out.println("* long");
                    continue;
                }

            } catch (NumberFormatException e) {
                System.out.println(str + " can't fit anywhere");

            }

        }

    }
}
