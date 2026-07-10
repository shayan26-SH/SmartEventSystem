package Behavioral.Strategy;


public class DepartmentPayment implements PaymentStrategy {
	
	private String name, accountnumber;
	private double availableBudget;
	
	/**
	 * @param name
	 * @param accountnumber
	 * @param availableBudget
	 */
	public DepartmentPayment(String name, String accountnumber, double availableBudget) {
		this.name = name;
		this.accountnumber = accountnumber;
		this.availableBudget = availableBudget;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the accountnumber
	 */
	public String getAccountnumber() {
		return accountnumber;
	}

	/**
	 * @return the availableBudget
	 */
	public double getAvailableBudget() {
		return availableBudget;
	}

	@Override
	public boolean pay(double amount) {
		// TODO Auto-generated method stub
		return (amount<=0) ? false: true;
	}

	@Override
	public String getPayment() {
		// TODO Auto-generated method stub
		return "Department Account";
	}}
