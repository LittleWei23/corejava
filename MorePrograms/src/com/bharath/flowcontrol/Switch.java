package com.bharath.flowcontrol;

public class Switch {

	public static void main(String[] args) {
		String choice = "Withdraw";
		switch(choice) {
		case "Withdraw":
			System.out.println("Withdraw");
			break;
		case "Check balance":
			System.out.println("Check balance");
			break;
		case "Change pin":
			System.out.println("Change pin");
			break;
		case "Deposit check":
			System.out.println("Deposit check");
			break;
		default:
			System.out.println("Time out");
		}
	}

}
