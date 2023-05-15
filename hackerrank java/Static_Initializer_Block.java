import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Static_Initializer_Block {
    public static void main(String[] args)throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int B =  Integer.parseInt(br.readLine());

        int H =  Integer.parseInt(br.readLine());


        if (B > 0 & H > 0) {
            System.out.println(B*H);
        }else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }


    }
}
