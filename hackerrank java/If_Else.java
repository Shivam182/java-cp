import java.io.*;

public class If_Else {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        String res = (input % 2 != 0 | (input % 2 == 0 & (input >= 6 & input <= 20))) ? "Weird" : "Not Weird";

        System.out.println(res);

    }
}