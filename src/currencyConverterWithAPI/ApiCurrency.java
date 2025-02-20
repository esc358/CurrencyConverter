package currencyConverterWithAPI;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

//TODO: Fix methods
//TODO: manipulate JSON to access first level, print it to String for user to select
//TODO: 1. convert json object to array
//TODO: Display currencies available to user to decide, apply validations
public class ApiCurrency
{
    Password password = new Password();
    String apiUrl = "https://api.currencyapi.com/v3/latest?apikey=";
    String apiKey = password.readApiKeyFromFile("./src/currencyConverterWithAPI/api-key.txt");


    //String urlRoute = apiUrl + apiKey;
        //URL url = new URL(urlRoute);
//        HttpURLConnection request = (HttpURLConnection) url.openConnection();
//
//        request.connect();
//        JsonParser jp = new JsonParser();
//    JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
//        System.out.println(root);

//    URL url = new URL(urlRoute);
//    HttpURLConnection request = (HttpURLConnection) url.openConnection();
//
//        request.connect();

//    JsonParser jp = new JsonParser();
//    JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
//    JsonObject jsonobj = root.getAsJsonObject();
//    JsonObject data = jsonobj.getAsJsonObject("data");
//
//
//
//    // Extract currency codes (keys of the "data" object) and build a string
//    StringBuilder currencyCodes2 = new StringBuilder();
//        for (String key : data.keySet()) {
//    currencyCodes2.append(key).append(", ");
//}
//
//    // Print the currency codes
//        System.out.println("Currency Codes: " + currencyCodes2.toString().trim()
//
//    public ApiCurrency() throws IOException
//    {
//    });
//
//        System.out.println(data);


}
