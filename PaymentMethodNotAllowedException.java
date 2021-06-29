package br.edu.univas.main;

public class PaymentMethodNotAllowedException extends Exception {
	
	private static final long serialVersionUID = -311894201221814284L;

	public PaymentMethodNotAllowedException(String message) {
		super(message);
	}
}
