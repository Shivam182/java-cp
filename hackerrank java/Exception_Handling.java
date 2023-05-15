import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception_Handling {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int x = Integer.parseInt(br.readLine());

            int y = Integer.parseInt(br.readLine());

            int res;
            try {
                res = x / y;
                System.out.println(res);
            } catch (ArithmeticException e) {
                System.out.println("java.lang.ArithmeticException: " + e.getLocalizedMessage());
            }

        } catch (Exception e) {

            System.out.println("java.util.InputMismatchException");
        }

    }
}
