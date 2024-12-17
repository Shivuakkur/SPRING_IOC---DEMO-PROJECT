package com.shivu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
	public static void main(String[] args) {
		//start the  IOC container using ApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
//		PaymentService p1 =context.getBean(PaymentService.class);
//		System.out.println(p1.hashCode());
//		PaymentService p2 =context.getBean(PaymentService.class);
//		System.out.println(p2.hashCode());
//		
//		PaymentService p3=context.getBean(PaymentService.class);
//		System.out.println(p3.hashCode());

		 //how to get the object from the IOC
		PaymentService service = context.getBean(PaymentService.class);
		service.doPayment(200.0);
	}

}
