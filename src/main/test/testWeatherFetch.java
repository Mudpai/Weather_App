import com.example.weatherexample.WeatherFetch;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class testWeatherFetch {
    @Test
    public void testFetchWeather() {
        try {
            // ex: New York City
            double latitude = 40.7128;
            double longitude = -74.0060;

            JSONObject weatherData = WeatherFetch.fetchWeather(latitude, longitude);

            assertNotNull(weatherData, "Weather data should not be null");
            assertEquals(weatherData.getDouble("lat"), latitude, 0.1);
            assertEquals(weatherData.getDouble("lon"), longitude, 0.1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}