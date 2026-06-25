import java.util.*;

public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double forecast(double currentValue, double growthRate, int years) {

        // Base Case
        if (years == 0) {
            return currentValue;
        }

        // Recursive Call
        return forecast(currentValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Current Value: ");
        double currentValue = sc.nextDouble();

        System.out.print("Enter Annual Growth Rate (%): ");
        double growthRate = sc.nextDouble();

        System.out.print("Enter Number of Years: ");
        int years = sc.nextInt();

        // Convert percentage to decimal
        growthRate = growthRate / 100.0;

        double futureValue = forecast(currentValue, growthRate, years);

        System.out.printf("Predicted Future Value after %d years = %.2f%n",
                years, futureValue);

        sc.close();
    }
}