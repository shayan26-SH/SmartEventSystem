package Behavioral.Strategy;

//=====================================================
//BEHAVIORAL DESIGN PATTERN START
//Pattern: Strategy
//
//PaymentStrategy defines the common operation that all
//payment methods must implement.
//
//The system can switch between payment methods without
//changing the PaymentContext class.
//====================================================

public interface PaymentStrategy {
	boolean pay(double amount);
	String getPayment();
}
