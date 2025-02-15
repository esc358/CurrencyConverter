package currencyConverterSimple;
import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter
{

    // Private variable Map<Key,Value>. Constructs an empty hash map
    private Map<String, Currency> currencyMap = new HashMap<>();

    //This void method takes a parameter of Object (Currency class)
    public void addCurrency(Currency currency)
    {
        //Map function puts (key, value) -> (string, object)
        currencyMap.put(currency.getName(), currency);
    }

    // Function takes 3 parameters. Return double
    public double convert(double amount, String fromCurrency, String toCurrency)
    {
        //Map function get Object Key
        Currency from = currencyMap.get(fromCurrency);
        Currency to = currencyMap.get(toCurrency);
        return (amount / from.getExchangeRate()) * to.getExchangeRate();
    }
}
