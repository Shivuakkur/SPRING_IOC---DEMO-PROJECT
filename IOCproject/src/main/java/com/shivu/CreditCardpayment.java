package com.shivu;

public class CreditCardpayment implements Ipayment {
	public CreditCardpayment() {
		System.out.println("CreditCard Payment Constructor Executed");
	}

	@Override
	public boolean ProcessPayment(double billAmt) {
		System.out.println("CreditCard Payment"+"successfully,,");
		return true;
	}

}
