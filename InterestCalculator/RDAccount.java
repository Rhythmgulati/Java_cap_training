package InterestCalculator;

public class RDAccount extends Account {
	private int noOfMonths;
	private double monthlyAmount;
	private int ageOfACHolder;

	public RDAccount(double monthlyAmount, int months, int age)
			throws InvalidAmountException, InvalidMonthsException, InvalidAgeException {
		super(monthlyAmount * months, getInterestRate(months, age));

		if (monthlyAmount <= 0) {
			throw new InvalidAmountException("Invalid amount.");
		}
		if (months <= 0) {
			throw new InvalidMonthsException("Invalid number of months");
		}
		if (age < 0 || age > 100) {
			throw new InvalidAgeException("Invalid age");
		}

		this.monthlyAmount = monthlyAmount;
		this.noOfMonths = months;
		this.ageOfACHolder = age;
	}

	private static double getInterestRate(int months, int age) {
		boolean isSenior = age >= 60;

		if (months == 6) {
			return isSenior ? 8.00 : 7.50;
		} else if (months == 9) {
			return isSenior ? 8.25 : 7.75;
		} else if (months == 12) {
			return isSenior ? 8.50 : 8.00;
		} else if (months == 15) {
			return isSenior ? 8.75 : 8.25;
		} else if (months == 18) {
			return isSenior ? 9.00 : 8.50;
		} else if (months == 21) {
			return isSenior ? 9.25 : 8.75;
		}
		return 8.00;
	}

	@Override
	double calculateInterest() {
		double totalInterest = 0;
		double principal = monthlyAmount;
		double ratePerMonth = interestRate / 12 / 100;

		for (int i = 0; i < noOfMonths; i++) {
			double monthsRemaining = noOfMonths - i;
			double interest = principal * ratePerMonth * monthsRemaining;
			totalInterest += interest;
		}

		return totalInterest;
	}
}