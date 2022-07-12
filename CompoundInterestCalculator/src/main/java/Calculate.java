
public class Calculate {
	public static double calculateCompoundInterest(double principalAmount, double interestRate, int years, int timesPerYear) {
		return Math.round(principalAmount * Math.pow(1 + (interestRate/timesPerYear), years * timesPerYear));
	}
}
