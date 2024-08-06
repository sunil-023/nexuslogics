import java.util.Scanner;

public class FinancialPlanningToolkit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Financial Planning Toolkit");
            System.out.println("1. Mortgage Calculator");
            System.out.println("2. Investment Return Calculator");
            System.out.println("3. Savings Goal Calculator");
            System.out.println("4. Income Tax Calculator (Optional)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    MortgageCalculator.main(null);
                    break;
                case 2:
                    InvestmentReturnCalculator.main(null);
                    break;
                case 3:
                    SavingsGoalCalculator.main(null);
                    break;
                case 4:
                    IncomeTaxCalculator.main(null);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }
}
