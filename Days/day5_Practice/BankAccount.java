package day5_Practice;

import java.util.Scanner;

public class BankAccount {
	String accountNumber;
	String accountHolderName;
	double balance;
	
	//constructor
	public BankAccount(String accNo, String accHolder, double initialBalance) {
		accountNumber =accNo;
		accountHolderName = accHolder;
		balance = initialBalance;
	}
	
	//Deposit method
	public void deposite(double amount) {
		if(amount >0) {
			balance += amount;
			System.out.println("Deposite $" + amount + " Successfully.");
		}else {
			System.out.println("Deposit amount must be positive.");
		}
	}
	
	//withdraw method
	public void withdraw(double amount) {
		if(amount >0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawn & "+amount+" successfully.");
		} else {
			System.out.println("Invalid amount or insufficient balance.");
		}
	}
	
	//Display account details
	public void displayAccountDetails() {
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Holder: "+accountHolderName);
		System.out.println("Balance: $"+balance);
	}
	
	//main method test
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Account Number: ");
		String accNo = sc.nextLine();
		
		System.out.println("Enter Account Holder Name: ");
		String accHolder = sc.nextLine();
		
		System.out.println("Enter Initial Balance: ");
		double initialBalance = sc.nextDouble();
		
		BankAccount account = new BankAccount(accNo, accHolder, initialBalance);
		
		int choice;
		do {
			System.out.println("\n1. Deposit\n2. Withdraw\n3. Display Details\n4. Exit");
			System.out.println("Enter chooice: ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter deposite amount: ");
				double depositAmt = sc.nextDouble();
				account.deposite(depositAmt);
				break;
			case 2:
				System.out.println("Enter withdrawal amount: ");
				double withdrawAmt = sc.nextDouble();
				account.withdraw(withdrawAmt);
				break;
			case 3:
				account.displayAccountDetails();
				break;
			case 4:
				System.out.println("Thank you for using the bank account system!");
				break;
			default:
				System.out.println("Invalid choice!");
			}
		}while(choice !=4);
		sc.close();
	}
}
