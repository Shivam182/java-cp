import java.io.*;

public class Input_Output {

    public static void main(String[] args)throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int[] outputs = new int[3];

        for(int i =0; i<3;i++){
            outputs[i] = Integer.parseInt(br.readLine());
        }

        for (int i : outputs) {
            System.out.println(i);
        }

    }
    
}