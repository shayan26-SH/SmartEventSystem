package Structural;

public class CleaningDecorator extends EventDecorator {

	public CleaningDecorator(EventBooking booking) {
		super(booking);
		// TODO Auto-generated constructor stub
	}

	private static final double cost_cleaning = 150.00;

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription();
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost() + cost_cleaning;
	}

}
