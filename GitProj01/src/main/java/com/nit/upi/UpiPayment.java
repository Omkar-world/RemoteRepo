package com.nit.upi;

import java.util.Random;

public class UpiPayment {
	public String openAccount(String name,double balance) {
		double accNum=new Random().nextDouble(500000000);
		return"account opened successfully "+accNum; 
	}
	
	public String withdral(double ammount) {
		return "transection sucessfull";
	}
	public String checkBalance(double accNum) {
		return "your balance is"+new Random().nextDouble(50000000);
	}
	public void ccc() {
		System.out.println("UpiPayment.ccc()");
	}

	
	public void abc() {
		System.out.println("hello");
	}
	
	public String closeAccount(double accNum) {
		return new Random().nextDouble(500000)+"Auccount is closed ";
	}
}
