import java.util.Scanner;

public class SavingsGoalCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter savings goal amount: ");
        double savingsGoalAmount = scanner.nextDouble();

        System.out.print("Enter time frame (in years): ");
        int timeFrameYears = scanner.nextInt();

        System.out.print("Enter annual rate of return (as a percentage): ");
        double annualRateOfReturn = scanner.nextDouble() / 100;

        double monthlyInvestment = calculateMonthlyInvestment(savingsGoalAmount, timeFrameYears, annualRateOfReturn);

        System.out.printf("Required Monthly Investment: %.2f\n", monthlyInvestment);
    }

    public static double calculateMonthlyInvestment(double savingsGoalAmount, int timeFrameYears, double annualRateOfReturn) {
        int numberOfPayments = timeFrameYears * 12;
        double monthlyRateOfReturn = annualRateOfReturn / 12;

        return (savingsGoalAmount * monthlyRateOfReturn) / (Math.pow(1 + monthlyRateOfReturn, numberOfPayments) - 1);
    }
}
