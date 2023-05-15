import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.*;

public class Currency_Formatter {

    public static String currencyFormat(Locale locale, double val) {

      

        NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);

        String currency = formatter.format(val);

        if (locale.getCountry() == "US") {
            return locale.getCountry()+": "+currency;

        }

        return locale.getDisplayCountry()+": "+currency;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double input = Double.parseDouble(br.readLine());

        String res[] = { currencyFormat(Locale.US, input), currencyFormat(new Locale("en", "IN"), input) , currencyFormat(Locale.CHINA, input),
                currencyFormat(Locale.FRANCE, input) };

        for (String string : res) {
            System.out.println(string);
        }

    }
}
