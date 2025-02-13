package currencyconverter;

public class Main
{
    public static void main(String[] args)
    {
        CurrencyConverter converter = new CurrencyConverter();
        converter.addCurrency(new Currency(1, "USD"));
        converter.addCurrency(new Currency(0.8, "EUR"));
        converter.addCurrency(new Currency(1.3, "GBP"));

        double amountInUSD = 100;
        double convertedAmount = converter.convert(amountInUSD, "USD", "GBP");
        System.out.println("Amount in USD: " + amountInUSD);
        System.out.println("Amount in GBP: " + convertedAmount);
    }
}
