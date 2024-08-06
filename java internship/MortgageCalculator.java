import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter loan amount: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Enter annual interest rate (as a percentage): ");
        double annualInterestRate = scanner.nextDouble() / 100;

        System.out.print("Enter loan term (in years): ");
        int loanTermYears = scanner.nextInt();

        double monthlyPayment = calculateMonthlyPayment(loanAmount, annualInterestRate, loanTermYears);

        System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
    }

    public static double calculateMonthlyPayment(double loanAmount, double annualInterestRate, int loanTermYears) {
        int numberOfPayments = loanTermYears * 12;
        double monthlyInterestRate = annualInterestRate / 12;

        return (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));
    }
}
