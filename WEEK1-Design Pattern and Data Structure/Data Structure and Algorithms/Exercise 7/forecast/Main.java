package forecast;

public class Main {
    public static void main(String[] args) {
        double initialAmount = 10000;
        double growthRate = 0.10;
        int years = 5;


        double futureValue = ForecastUtil.forecastValueRecursive(initialAmount, growthRate, years);
        System.out.println("Future Value (Recursive): " + futureValue);


        Double[] memo = new Double[years + 1];
        double futureValueMemo = ForecastUtil.forecastValueMemo(initialAmount, growthRate, years, memo);
        System.out.println("Future Value (Memoized): " + futureValueMemo);
    }
}
