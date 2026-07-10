package Behavioral.State;

// ConfirmedState represents a booking that has been paid.
//
// A confirmed booking:
// - Cannot be paid again
// - Can be checked in
// - Can be cancelled
// - Cannot be completed before check-in

public class ConfirmedState implements BookingState {

    @Override
    public void pay(BookingContext context) {
        System.out.println(
                "Payment failed: this booking has already been paid."
        );
    }

    @Override
    public void checkin(BookingContext context) {
        System.out.println("Check-in successful.");

        // After check-in, the booking moves to CheckedInState.
        context.setState(new CheckedInState());
    }

    @Override
    public void cancel(BookingContext context) {
        System.out.println("Confirmed booking cancelled.");

        context.setState(new CancelledState());
    }

    @Override
    public void complete(BookingContext context) {
        System.out.println(
                "Completion failed: the guest must check in first."
        );
    }

    @Override
    public String getStateName() {
        return "Confirmed";
    }
}