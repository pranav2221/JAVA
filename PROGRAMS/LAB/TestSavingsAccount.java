import java.util.Scanner;

class SavingsAccount {
    private static double annualInterestRate; 
    private double savingsBalance;

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    
    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

   
    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }

    
    public void displayBalance() {
        System.out.printf("Current Savings Balance: Rs %.2f%n", savingsBalance);
    }
}


public class TestSavingsAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter initial balance for Saver 1: Rs ");
        double initialBalanceSaver1 = scanner.nextDouble();

        
        System.out.print("Enter initial balance for Saver 2: Rs ");
        double initialBalanceSaver2 = scanner.nextDouble();

        
        SavingsAccount saver1 = new SavingsAccount(initialBalanceSaver1);
        SavingsAccount saver2 = new SavingsAccount(initialBalanceSaver2);

        
        System.out.print("Enter the annual interest rate (e.g., enter 4 for 4%): ");
        double interestRate = scanner.nextDouble();
        SavingsAccount.modifyInterestRate(interestRate / 100); 

        
        System.out.println("\nCalculating interest with an annual interest rate of " + interestRate + "%:");
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.print("Saver 1: ");
        saver1.displayBalance();
        System.out.print("Saver 2: ");
        saver2.displayBalance();

        
        System.out.print("\nEnter the new annual interest rate (e.g., enter 5 for 5%): ");
        double newInterestRate = scanner.nextDouble();
        SavingsAccount.modifyInterestRate(newInterestRate / 100); 

        
        System.out.println("\nCalculating interest with an annual interest rate of " + newInterestRate + "%:");
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.print("Saver 1: ");
        saver1.displayBalance();
        System.out.print("Saver 2: ");
        saver2.displayBalance();

        scanner.close();
    }
}
