package br.edu.univas.main;

import br.edu.univas.controller.Customer;
import br.edu.univas.controller.CustomerController;

public class StartApp {
    public static void main(String[] args) {
		
    	
    	
    	CustomerController controller = new CustomerController();
		try {
			Customer a = controller.createCustomer();
			System.out.println(a.getName());
			System.out.println(a.getCpf());
			System.out.println(a.getPaymentMethod().data());
		} catch (PaymentMethodNotAllowedException e) {
			e.printStackTrace();
	}
}
