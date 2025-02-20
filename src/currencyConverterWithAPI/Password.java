package currencyConverterWithAPI;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Password
{
    //Read .txt file
    public String readApiKeyFromFile(String filePath)
    {
        BufferedReader reader = null;
        try
        {
            reader = new BufferedReader(new FileReader(filePath));
            String apiKey = reader.readLine(); // Read the first line which should contain the API key
            reader.close();
            return apiKey;
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }

    }
}
