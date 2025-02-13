package currencyconverter;
import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter
{

    // Map to store currency objects with their codes as keys
    private Map<String, Currency> currencyMap = new HashMap<>();

    public void addCurrency(Currency currency)
    {
        currencyMap.put(currency.getName(), currency);
    }

    public double convert(double amount, String fromCurrency, String toCurrency)
    {
        Currency from = currencyMap.get(fromCurrency);
        Currency to = currencyMap.get(toCurrency);
        return (amount / from.getExchangeRate()) * to.getExchangeRate();
    }
}
