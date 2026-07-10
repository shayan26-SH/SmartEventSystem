package Behavioral.State;


//package Behavioral.State;

//CompletedState represents a finished event.
//
//A completed booking cannot be changed because
//the booking lifecycle has ended.

public class CompletedState implements BookingState {

 @Override
 public void pay(BookingContext context) {
     System.out.println(
             "Payment failed: the event has already been completed."
     );
 }

 @Override
 public void checkin(BookingContext context) {
     System.out.println(
             "Check-in failed: the event has already been completed."
     );
 }

 @Override
 public void cancel(BookingContext context) {
     System.out.println(
             "Cancellation failed: a completed booking cannot be cancelled."
     );
 }

 @Override
 public void complete(BookingContext context) {
     System.out.println(
             "Completion failed: the event is already completed."
     );
 }

 @Override
 public String getStateName() {
     return "Completed";
 }
}