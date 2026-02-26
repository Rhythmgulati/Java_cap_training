package InterestCalculator;

public class FDAccount extends Account {
    private int noOfDays;
    private int ageOfACHolder;
    
    public FDAccount(double amount, int days, int age) throws InvalidAmountException, InvalidDaysException, InvalidAgeException {
        super(amount, getInterestRate(amount, days, age));
        
        if (days < 0) {
            throw new InvalidDaysException("Invalid Number of days.");
        }
        if (age < 0 || age > 100) {
            throw new InvalidAgeException("Invalid age.");
        }
        
        this.noOfDays = days;
        this.ageOfACHolder = age;
    }
    
    private static double getInterestRate(double amount, int days, int age) {
        boolean isSenior = age >= 60;
        
        if (amount < 10000000) { 
            if (days >= 7 && days <= 14) {
                return isSenior ? 5.00 : 4.50;
            } else if (days >= 15 && days <= 29) {
                return isSenior ? 5.25 : 4.75;
            } else if (days >= 30 && days <= 45) {
                return isSenior ? 6.00 : 5.50;
            } else if (days >= 46 && days <= 60) {
                return isSenior ? 7.50 : 7.00;
            } else if (days >= 61 && days <= 184) {
                return isSenior ? 8.00 : 7.50;
            } else if (days >= 185 && days <= 365) {
                return isSenior ? 8.50 : 8.00;
            }
        } else { 
            if (days >= 7 && days <= 14) {
                return 6.50;
            } else if (days >= 15 && days <= 29) {
                return 6.75;
            } else if (days >= 30 && days <= 45) {
                return 6.75;
            } else if (days >= 46 && days <= 60) {
                return 8.00;
            } else if (days >= 61 && days <= 184) {
                return 8.50;
            } else if (days >= 185 && days <= 365) {
                return 10.00;
            }
        }
        return 4.00; 
    }
    
    @Override
    double calculateInterest() {
        return (amount * interestRate) / 100;
    }
}