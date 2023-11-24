package aplication;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainException;

public class MainAplication {

	public static void main(String args []) {
		try {
			Locale.setDefault(Locale.US);
			Scanner input = new Scanner(System.in);
			System.out.println("Enter account data");
			System.out.print("Number: ");
			Integer number = input.nextInt();
			System.out.print("Holder: ");
			input.nextLine();
			String name = input.nextLine();
			System.out.print("Initial balance: ");
			Double initBalance = input.nextDouble();
			System.out.print("Withdraw limit: ");
			Double limit = input.nextDouble();
			Account account = new Account(number, name, initBalance, limit);
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double amount = input.nextDouble();
			account.withdraw(amount);
			System.out.println(account);
		}
		catch(DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		
		
		
	}
}
