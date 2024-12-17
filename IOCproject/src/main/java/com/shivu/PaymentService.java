package com.shivu;

public class PaymentService {
	private Ipayment payment;
	
	public PaymentService() {
		System.out.println("Payment service constructor executed");
//		public PaymentService(IPayment payment) {
//			System.out.println("IPayment ");
//		}
	}
	
	public PaymentService(Ipayment payment) {
		
		this.payment = payment;
		System.out.println("1 parameter constructor executed");
	}
	
	public void setPayment(Ipayment payment) {
		this.payment=payment;
		System.out.println("setter method is executed");
	}
	public void ProcessPayment(Ipayment payment) {
		this.payment=payment;
	}

	public void doPayment(Double billAmt) {
		// TODO Auto-generated method stub
		boolean status = payment.ProcessPayment(billAmt);
		
		if(status) {
			System.out.println("recipt printing");
		}else {
			System.out.println("card cancelled");
		}
	}

	

}
