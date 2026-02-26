package InterestCalculator;

public abstract class Account {
    protected double interestRate;
    protected double amount;
    
    public Account(double amount, double interestRate) {
        this.amount = amount;
        this.interestRate = interestRate;
    }
    
    abstract double calculateInterest();
}