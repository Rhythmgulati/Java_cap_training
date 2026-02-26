package InterestCalculator;

import java.util.Scanner;

public class AccountService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        
        do {
            System.out.println("\nSelect the option:");
            System.out.println("1. Interest Calculator -SB");
            System.out.println("2. Interest Calculator -FD");
            System.out.println("3. Interest Calculator -RD");
            System.out.println("4. Exit");
            
            option = scanner.nextInt();
            
            switch (option) {
                case 1:
                    calculateSBInterest(scanner);
                    break;
                    
                case 2:
                    calculateFDInterest(scanner);
                    break;
                    
                case 3:
                    calculateRDInterest(scanner);
                    break;
                    
                case 4:
                    System.out.println("Exiting...");
                    break;
                    
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 4);
        
        scanner.close();
    }
    
    private static void calculateSBInterest(Scanner scanner) {
        try {
            System.out.println("Enter Amount in your account:");
            double amount = scanner.nextDouble();
            scanner.nextLine(); 
            
            System.out.println("Enter account type (Normal/NRI):");
            String type = scanner.nextLine();
            
            SBAccount sbAccount = new SBAccount(amount, type);
            double interest = sbAccount.calculateInterest();
            
            System.out.println("Interest gained: Rs. " + (int)interest);
            
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }
    }
    
    private static void calculateFDInterest(Scanner scanner) {
        try {
            System.out.println("Enter the FD amount:");
            double amount = scanner.nextDouble();
            
            System.out.println("Enter the Number of days:");
            int days = scanner.nextInt();
            
            System.out.println("Enter your age:");
            int age = scanner.nextInt();
            
            FDAccount fdAccount = new FDAccount(amount, days, age);
            double interest = fdAccount.calculateInterest();
            
            System.out.println("Interest is:" + (int)interest);
            
        } catch (InvalidAmountException | InvalidDaysException | InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
    
    private static void calculateRDInterest(Scanner scanner) {
        try {
            System.out.println("Enter the monthly amount:");
            double monthlyAmount = scanner.nextDouble();
            
            System.out.println("Enter the number of months (6,9,12,15,18,21):");
            int months = scanner.nextInt();
            
            System.out.println("Enter your age:");
            int age = scanner.nextInt();
            
            RDAccount rdAccount = new RDAccount(monthlyAmount, months, age);
            double interest = rdAccount.calculateInterest();
            
            System.out.println("Interest gained: Rs. " + (int)interest);
            
        } catch (InvalidAmountException | InvalidMonthsException | InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}