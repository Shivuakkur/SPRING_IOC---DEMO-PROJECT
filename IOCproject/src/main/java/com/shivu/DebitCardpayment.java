package com.shivu;

public class DebitCardpayment implements Ipayment {
	public DebitCardpayment() {
		System.out.println("DebitCardPayment constructor successfully executed");
		
	}
	
	@Override
	public boolean ProcessPayment(double billAmt) {
		// TODO Auto-generated method stub
		System.out.println("debitcardpayment"+"successfully..");
		return true;
	}

}
