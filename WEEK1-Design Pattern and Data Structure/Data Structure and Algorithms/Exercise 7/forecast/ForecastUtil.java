package forecast;

public class ForecastUtil {


    public static double forecastValueRecursive(double initialAmount, double growthRate, int years) {
        if (years == 0) {
            return initialAmount;
        }
        return forecastValueRecursive(initialAmount, growthRate, years - 1) * (1 + growthRate);
    }


    public static double forecastValueMemo(double initialAmount, double growthRate, int years, Double[] memo) {
        if (years == 0) return initialAmount;

        if (memo[years] != null) return memo[years];

        memo[years] = forecastValueMemo(initialAmount, growthRate, years - 1, memo) * (1 + growthRate);
        return memo[years];
    }
}
