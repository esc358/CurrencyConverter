
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
    public static void main(String[] args)
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


        System.out.println("Thanks for using this.");





    }

}
