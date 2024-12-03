package com.aop.serviceimpl;

import com.aop.service.PaymentService;

public class paymentServiceImpl implements PaymentService {

	@Override
	public void makePayment() {
		System.out.println("Amount Debited");
		//
		//
		//
		System.out.println("Amount Credited");

	}

}
