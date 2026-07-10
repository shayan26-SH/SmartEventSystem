package Behavioral.Strategy;

public class PaymentContext {
	PaymentStrategy strategy;

	public PaymentContext() {

	}

	/**
	 * @param strategy
	 */
	public PaymentContext(PaymentStrategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * @return the strategy
	 */
	public PaymentStrategy getStrategy() {
		return strategy;
	}

	/**
	 * @param strategy the strategy to set
	 */
	public void setStrategy(PaymentStrategy strategy) {
		if (strategy == null)
			throw new IllegalArgumentException();

		this.strategy = strategy;
	}

	public boolean processpayment(double amount) {
		if (strategy == null)
			throw new IllegalArgumentException();
		return strategy.pay(amount);
	}

	public String getSelectedPaymentMethod() {

		if (strategy == null) {
			return "No payment method selected";
		}

		return strategy.getPayment();
	}

}
