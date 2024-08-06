import java.util.Scanner;

public class InvestmentReturnCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial investment amount: ");
        double initialInvestment = scanner.nextDouble();

        System.out.print("Enter annual rate of return (as a percentage): ");
        double annualRateOfReturn = scanner.nextDouble() / 100;

        System.out.print("Enter investment time horizon (in years): ");
        int investmentHorizonYears = scanner.nextInt();

        double futureValue = calculateFutureValue(initialInvestment, annualRateOfReturn, investmentHorizonYears);

        System.out.printf("Future Value: %.2f\n", futureValue);
    }

    public static double calculateFutureValue(double initialInvestment, double annualRateOfReturn, int investmentHorizonYears) {
        return initialInvestment * Math.pow(1 + annualRateOfReturn, investmentHorizonYears);
    }
}
