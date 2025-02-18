
package currencyConverterWithAPI;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


public class CurrencyConverter
{
    public static void main(String[] args) throws IOException
    {
        HashMap<Integer, String> currencyCodes = new HashMap<>();

        String fromCode, toCode;
        double amount;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Currency Convert");
        System.out.println("Enter currency code to convert from: ");

        System.out.println("1:USD\t 2:EUR\t 3:GBP\t 4:JPY\t 5:AUD");

        System.out.println("Enter from currency code: ");
        fromCode = scanner.next();

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
        JsonObject data = jsonobj.getAsJsonObject("data");

        //TODO: manipulate JSON to access first level, print it to String for user to select
        //TODO: 1. convert json object to array
        //TODO: Display currencies available to user to decide, apply validations

        // Extract currency codes (keys of the "data" object) and build a string
        StringBuilder currencyCodes2 = new StringBuilder();
        for (String key : data.keySet()) {
            currencyCodes2.append(key).append(", ");
        }

        // Print the currency codes
        System.out.println("Currency Codes: " + currencyCodes2.toString().trim());

        System.out.println(data);
        //System.out.println(currencies);



        //JsonArray currencies = data.toJSONArray;
        //String currency = data.toString();
       // JsonObject currency = data.getAsJsonObject(fromCode);

        //System.out.println(currency);

        //TODO: Continue manipulating JSON data, be creative an create methods to access JSON data needed.

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

//    private static void parseAndPrintCurrencyCodes(String jsonResponse) {
//        JsonParser jp = new JsonParser();
//        JsonElement root = jp.parse(jsonResponse);
//        JsonObject jsonObject = root.getAsJsonObject();
//
//        // Get the "data" object
//        JsonObject data = jsonObject.getAsJsonObject("data");
//
//
//    }

}
