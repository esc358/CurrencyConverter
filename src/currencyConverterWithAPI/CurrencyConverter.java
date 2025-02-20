
package currencyConverterWithAPI;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;


public class CurrencyConverter
{
    public static void main(String[] args) throws IOException
    {
        ApiCurrency apiCurrency = new ApiCurrency();
        HashMap<Integer, String> currencyCodes = new HashMap<>();
        System.out.println(apiCurrency);
        String fromCode, toCode;
        double amount;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Welcome to Currency Convert");
//        System.out.println("Enter currency code to convert from: ");
//        System.out.println("1:USD\t 2:EUR\t 3:GBP\t 4:JPY\t 5:AUD");
//        System.out.println("Enter from currency code: ");
//        fromCode = scanner.next();
//        System.out.println("Enter currency code to convert to: ");
//        System.out.println("1:USD\t 2:EUR\t 3:GBP\t 4:JPY\t 5:AUD");
//        System.out.println("Enter to currency code: ");
//        toCode = currencyCodes.get(scanner.nextInt());
//        System.out.println("Enter amount to convert: ");
//        amount = scanner.nextFloat();
//        System.out.println("Thanks for using this.");

    }

}
