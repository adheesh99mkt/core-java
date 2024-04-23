package com.bankdemo;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount [] barr=new BankAccount[3];
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter the choice: "
					+ "\n1.Create bank account\n2.Deposite\n3.Withdraw\n4.Check balance\n5.Display");
			
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				BankAccountUtility.createAccount(barr);
				break;
			case 2:
				BankAccountUtility.deposite(barr);
				break;
			case 3:
				BankAccountUtility.withdraw(barr);
				break;
			case 4:
				BankAccountUtility.checkBalance(barr);
				break;
			case 5:
				BankAccountUtility.display(barr);
				break;
				default:
					System.out.println("Exited!");
					return;
			}
			
		}
		
	}

}