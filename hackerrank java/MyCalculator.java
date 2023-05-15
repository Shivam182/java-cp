import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MyCalculator {

    public static long power(int n , int p)throws MyException{

        if (n == 0 | p == 0) {
            throw new MyException("n and p should not be zero.");
        }else if (n < 0 | p<0) {
            throw new MyException("n or p should not be negative.");
        }
        
        return (long)Math.pow(n, p);

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int n =  Integer.parseInt(br.readLine());
        int p =  Integer.parseInt(br.readLine());

        try {
             System.out.println(power(n, p));
        } catch (Exception e) {
            System.out.println("java.lang.Exception: "+e.getMessage());
        }
       
    }
}

class MyException extends RuntimeException {
    public MyException(String message){
        super(message);
    }
}
