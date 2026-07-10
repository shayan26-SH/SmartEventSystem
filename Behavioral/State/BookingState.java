package Behavioral.State;
//=====================================================
//BEHAVIORAL DESIGN PATTERN START
//Pattern: State
//
//BookingState defines the actions that can be performed
//on an event booking.
//
//Each concrete state decides which actions are allowed
//and how the booking should respond.
//=====================================================

public interface BookingState {
	
	void pay(BookingContext context);
	void checkin(BookingContext context);
	//void checkout(BookingContext context);
	void cancel(BookingContext context);
	void complete(BookingContext context);
	String getStateName();
	
	
}
