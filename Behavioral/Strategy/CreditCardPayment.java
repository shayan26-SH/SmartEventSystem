package Behavioral.Strategy;

public class CreditCardPayment implements PaymentStrategy {
	private String cardname, cardnumber;

	/**
	 * @param cardname
	 * @param cardnumber
	 */
	public CreditCardPayment(String cardname, String cardnumber) {
		if (cardname == null || cardnumber == null || cardname.isEmpty() || cardnumber.isEmpty())
			throw new IllegalArgumentException();
		this.cardname = cardname;
		this.cardnumber = cardnumber;
	}
	

	/**
	 * @return the cardname
	 */
	public String getCardname() {
		return cardname;
	}


	/**
	 * @return the cardnumber
	 */
	public String getCardnumber() {
		return cardnumber;
	}


	@Override
	public boolean pay(double amount) {
		// TODO Auto-generated method stub
		return (amount <=0)? false : true;
	}

	@Override
	public String getPayment() {
		// TODO Auto-generated method stub
		return "Credit Card";
	}
	
}
