package com.bharath.flowcontrol;

public class IfElseLatter {

	public static void main(String[] args) {
		String choice = "Withdraw";
		if (choice.equals("Check balance")) {
			System.out.println("check balance");
		} else if (choice.equals("Withdraw")) {
			System.out.println("Withdraw");
		} else if (choice.equals("Change Pin")) {
			System.out.println("Change Pin");
		} else if (choice.equals("Deposit Check")) {
			System.out.println("Deposit Check");
		} else {
			System.out.println("Time out");
		}
	}
}
