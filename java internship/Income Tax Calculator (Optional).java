import java.util.Scanner;

public class IncomeTaxCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter annual income: ");
        double annualIncome = scanner.nextDouble();

        // Example tax slabs (adjust as needed)
        double tax = calculateIncomeTax(annualIncome);

        System.out.printf("Estimated Tax Liability: %.2f\n", tax);
    }

    public static double calculateIncomeTax(double income) {
        double tax = 0;
        if (income <= 10000) {
            tax = income * 0.10; // 10% tax rate for income up to 10,000
        } else if (income <= 20000) {
            tax = 1000 + (income - 10000) * 0.15; // 15% tax rate for income between 10,000 and 20,000
        } else {
            tax = 2500 + (income - 20000) * 0.20; // 20% tax rate for income above 20,000
        }
        return tax;
    }
}
