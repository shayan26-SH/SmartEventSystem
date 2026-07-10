package Structural;


public class SecurityDecorator extends EventDecorator {

	public SecurityDecorator(EventBooking booking) {
		super(booking);
		// TODO Auto-generated constructor stub
	}
	private static final double cost = 150.00;
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription();
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost() + cost;
	}
	
}
