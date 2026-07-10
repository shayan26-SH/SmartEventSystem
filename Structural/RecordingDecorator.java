package Structural;


public class RecordingDecorator extends EventDecorator {
	private static final double cost = 120.00;
	
	public RecordingDecorator(EventBooking booking) {
		super(booking);
		// TODO Auto-generated constructor stub
	}

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
