package currencyConverterWithAPI;

import java.util.HashMap;
import java.util.Scanner;

public class CurrencyConverter
{
    public static void main(String[] args)
    {
        HashMap<Integer, String> currencyCodes = new HashMap<>();

        //currency codes
        currencyCodes.put(1, "USD");
        currencyCodes.put(2, "EUR");
        currencyCodes.put(3, "GBP");
        currencyCodes.put(4, "JPY");
        currencyCodes.put(5, "AUD");

        String fromCode, toCode;
        double amount;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Currency Convert");

        System.out.println("Enter currency code to convert from: ");

        System.out.println("1:USD\t 2:EUR\t 3:GBP\t 4:JPY\t 5:AUD");

        System.out.println("Enter from currency code: ");
        fromCode = currencyCodes.get(scanner.nextInt());

        System.out.println("Enter currency code to convert to: ");

        System.out.println("1:USD\t 2:EUR\t 3:GBP\t 4:JPY\t 5:AUD");

        System.out.println("Enter to currency code: ");
        toCode = currencyCodes.get(scanner.nextInt());

        System.out.println("Enter amount to convert: ");
        amount = scanner.nextFloat();

        //sendHttpGetRequest(fromCode, toCode, amount);

        System.out.println("Thanks for using this.");

    }

    private static void sendHttpGetRequest(String fromCode, String toCode, double amount)
    {
        String url = "https://api.exchangeratesapi.io/latest?base=" + fromCode + "&symbols=" + toCode;

    }
}
