package Structural;


public abstract class EventDecorator implements EventBooking {
	
	protected EventBooking booking;

	/**
	 * @param booking
	 */
	public EventDecorator(EventBooking booking) {
	if ( booking == null ) {
		throw new IllegalArgumentException();
	}
		this.booking = booking;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return booking.getDescription();
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return booking.getCost();
	}
	
}


