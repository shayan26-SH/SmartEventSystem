package Behavioral.State;
//BookingContext is the Context class in the State Pattern.
//
//It stores the current state of the booking and delegates
//all actions to that state.
//
//The context does not contain large if-else or switch
//statements. Each state controls its own behavior.

public class BookingContext {

	private String bookid, eventname;
	private BookingState state;

	/**
	 * @param bookid
	 * @param eventname
	 * @param state
	 */
	public BookingContext(String bookid, String eventname) {
		if (bookid == null || bookid.isBlank())
			throw new IllegalArgumentException();
		if (eventname == null || eventname.isBlank())
			throw new IllegalArgumentException();
		this.bookid = bookid;
		this.eventname = eventname;
		this.state = new PendingState();
	}

	/**
	 * @return the bookid
	 */
	public String getBookid() {
		return bookid;
	}

	/**
	 * @param bookid the bookid to set
	 */
	public void setBookid(String bookid) {
		this.bookid = bookid;
	}

	/**
	 * @return the eventname
	 */
	public String getEventname() {
		return eventname;
	}

	/**
	 * @param eventname the eventname to set
	 */
	public void setEventname(String eventname) {
		this.eventname = eventname;
	}

	/**
	 * @return the state
	 */
	public BookingState getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(BookingState newstate) {
		if ( newstate == null) throw new IllegalArgumentException();
		String oldstate = newstate.getStateName();
		this.state = newstate;
		 System.out.println(
	                "State changed from "
	                        + oldstate
	                        + " to "
	                        + newstate.getStateName()
	                        + "."
	        );
	}
	
	public void pay() {
		  System.out.println("\nPayment request:");
		  state.checkin(this);
	}
	

	public void checkin() {
		  System.out.println("\nCheckin request:");
		  state.checkin(this);
	}

	public void checkout() {
		  System.out.println("\nCheckout request:");
		  state.checkin(this);
	}

	public void cancel() {
		  System.out.println("\nCancel request:");
		  state.checkin(this);
	}

	public void complete() {
		  System.out.println("\nComplete request:");
		  state.checkin(this);
	}
	
    public void displayBookingStatus() {
        System.out.println("\nBOOKING STATUS");
        System.out.println("----------------------------");
        System.out.println("Booking ID: " + bookid);
        System.out.println("Event: " + eventname);
        System.out.println("Current State: "
                + state.getStateName());
    }
}
	

