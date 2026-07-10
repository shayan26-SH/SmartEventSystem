package Structural;
//==========================================
//STRUCTURAL DESIGN PATTERN START
//Pattern: Decorator
//
//This interface represents the component.
//Both the basic booking and decorators
//implement this interface.
//=========

public interface EventBooking {
	String getDescription();
	double getCost();
}
