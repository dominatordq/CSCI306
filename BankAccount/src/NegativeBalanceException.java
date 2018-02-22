/**
 * @author dquintana
 * NegativeBalanceException class
 */
public class NegativeBalanceException extends Exception {
	private double negativeBalance;
	
	public NegativeBalanceException() {
		super("Error: negative balance");
	}
	public NegativeBalanceException(double negative) {
		super("Amount exceeds balance by " + negative);
		negativeBalance = negative;
	}
}
