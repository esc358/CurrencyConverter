/*Created by ESCL
* February 12, 2025 @ 9:26pm EST*/
package currencyConverterSimple;

public class Currency
{
    //define private variables for security
    private String name;
    private double exchangeRate;

    //constructor
    public Currency(double exchangeRate, String name)
    {
        this.exchangeRate = exchangeRate;
        this.name = name;
    }

    //get methods
    public double getExchangeRate()
    {
        return exchangeRate;
    }

    public String getName()
    {
        return name;
    }
}
