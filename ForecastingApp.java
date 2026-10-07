public class ForecastingApp {

    public double forecast(double previousValue, double growthRate) {
        return previousValue * (1 + growthRate);
    }
}
