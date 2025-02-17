
package currencyConverterWithAPI;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
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


        String route = "https://api.currencyapi.com/v3/latest?apikey=" + readApiKeyFromFile("./src/currencyConverterWithAPI/api-key.txt");

        URL url = new URL(route);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        JsonObject jsonobj = root.getAsJsonObject();
        JsonObject rates = jsonobj.getAsJsonObject("meta");
        String date = rates.get("last_updated_at").getAsString();
        System.out.println(date);

    }

    private static void sendHttpGetRequest(String fromCode, String toCode, double amount) throws IOException
    {
        String filePath = "./src/currencyConverterWithAPI/api-key.txt";
        String apiKey = readApiKeyFromFile(filePath);
        System.out.println(apiKey);
        String url = "https://api.currencyapi.com/v3/latest?apikey=" + apiKey;
    }

    //Read .txt file
    public static String readApiKeyFromFile(String filePath) throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String apiKey = reader.readLine(); // Read the first line which should contain the API key
        reader.close();
        return apiKey;
    }
}
