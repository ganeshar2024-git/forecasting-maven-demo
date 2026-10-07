import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForecastingAppTest {

    @Test
    public void testForecast() {

        ForecastingApp app = new ForecastingApp();

        double result = app.forecast(100, 0.10);

        assertEquals(110.0, result, 0.001);
    }
}
