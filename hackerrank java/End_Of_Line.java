import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class End_Of_Line {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int length = input.length();
        int i = 1;
        while(length > 0){
            System.out.println(i++ +" "+input);
            input = br.readLine();
            if (input != null) {
                length = input.length();
            }else{
                break;
            }
        }

    }
}
