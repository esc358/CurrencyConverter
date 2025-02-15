# Currency Converter

The main purpose of this application is to create a currency convertor by using different methods.

## Package currencyConverterSimple

In this package, there are 3 classes:

1. **Main:** the entry point in the Java application.
   1. The class CurrencyConverter is instantiated.
   2. The void method from CurrencyConverter addCurrency is called:
      1. This method takes a parameter of type value Object Currency class.
      2. Therefore, the constructor parameters are int and string values.
      3. The map.put function inside addCurrency adds to the map.
      4. A double value is assigned.
      5. The convert method from CurrencyConverter takes 3 parameter. The string has to be values found on the K,V map. Otherwise exception in thread.
2. **Currency:** blueprint class
   1. Variables are private for security
   2. Constructor method to be able to create class.
   3. Get methods for private variables.
3. **CurrencyConverter:** has a private Map and creates a hash map.
   1. addCurrency method takes Object parameter.
      1. Puts the value string from the constructor into the map.
   2. convert method takes 3 parameters.
      1. To return the value values are get from the map
      



