
package currencyConverterWithAPI;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;


public class CurrencyConverter
{
    public static void main(String[] args) throws IOException
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

        String apik = System.getenv("API_KEY");
        System.out.println(apik);
        String url = "https://api.currencyapi.com/v3/latest?apikey=" + apik;

        System.out.println(url);

        String filePath = "./src/currencyConverterWithAPI/api-key.txt";
        String apiKey = readApiKeyFromFile(filePath);
        System.out.println(apiKey);
       // String url = "https://api.currencyapi.com/v3/latest?apikey=" + System.getenv("Api-key");

    }

    private static void sendHttpGetRequest(String fromCode, String toCode, double amount) throws IOException
    {
        String filePath = "./src/currencyConverterWithAPI/api-key.txt";
        String apiKey = readApiKeyFromFile(filePath);
        System.out.println(apiKey);
        String url = "https://api.currencyapi.com/v3/latest?apikey=" + System.getenv("Api-key");
    }

    public static String readApiKeyFromFile(String filePath) throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String apiKey = reader.readLine(); // Read the first line which should contain the API key
        reader.close();
        return apiKey;
    }
}
