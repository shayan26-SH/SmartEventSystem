package Behavioral.State;


public class StateDemo {

    public static void main(String[] args) {

        BookingContext booking = new BookingContext(
                "B001",
                "Cybersecurity Conference"
        );

        booking.displayBookingStatus();

        // Pending -> Confirmed
        booking.pay();

        // Confirmed -> Checked In
        booking.checkin();

        // This action is rejected because checked-in
        // bookings cannot be cancelled.
        booking.cancel();

        // Checked In -> Completed
        booking.complete();

        // This action is rejected because the event
        // has already been completed.
        booking.checkin();

        booking.displayBookingStatus();
    }
}