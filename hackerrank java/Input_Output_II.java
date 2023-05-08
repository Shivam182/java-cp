import java.io.*;

public class Input_Output_II {
    public static void main(String[] args)throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

        int input1 = Integer.parseInt(br.readLine());
        double input2 = Double.parseDouble(br.readLine());
        String input3 = br.readLine();

        System.out.println("String: "+input3);
        System.out.println("Double: "+input2);
        System.out.println("Integer: "+input1);
    }
}
