package InterestCalculator;

public class SBAccount extends Account {
    private String accountType;
    
    public SBAccount(double amount, String type) throws InvalidAmountException {
        super(amount, getInterestRate(type));
        this.accountType = type;
    }
    
    private static double getInterestRate(String type) {
        if (type.equalsIgnoreCase("Normal")) {
            return 4.0;
        } else if (type.equalsIgnoreCase("NRI")) {
            return 6.0;
        }
        return 4.0;
    }
    
    @Override
    double calculateInterest() {
        return (amount * interestRate) / 100;
    }
}