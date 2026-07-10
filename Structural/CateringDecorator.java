package Structural;

public class CateringDecorator extends EventDecorator {
	private static final double CATERING_COST = 200.00;

	public CateringDecorator(EventBooking booking) {
		super(booking);
		// TODO Auto-generated constructor stub
	}

//	private static final double cost = 200.00;


	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription() + "\nOptional Service : Catering";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost() + CATERING_COST;
	}
}
