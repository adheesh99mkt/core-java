package com.bankdemo;

import java.util.Scanner;

public class BankAccountUtility {
	public static void createAccount(BankAccount [] barr) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<barr.length;i++) {
			System.out.print("Name: ");
			String name=sc.next();
			System.out.print("Initial deposite: ");
			double bal=sc.nextDouble();
			barr[i]=new BankAccount(name, bal);
		}
	}
	public static void display(BankAccount [] barr) {
		for(int i=0;i<barr.length;i++) {
			System.out.println(barr[i]);
		}
	}
	
	public static void deposite(BankAccount []barr) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the account number:");
		int acc=sc.nextInt();
		for(int i=0;i<barr.length;i++) {
			if(i==acc-1) {
				System.out.println("Enter the amount to be deposited:");
				double money=sc.nextDouble();
				double bal=barr[i].getbalance();
				double newbal=bal+money;
				barr[i].setbalance(newbal);
				System.out.println("succesful deposit/////////////");
				break;
			}
			else {
				System.out.println("No such user!");
			}
		}
		
		
		
		
		
		
	}
	public static void withdraw(BankAccount[] barr) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the account number:");
		int acc=sc.nextInt();
		for(int i=0;i<barr.length;i++) {
			if(i==acc-1) {
				System.out.println("Enter the amount to be withdrawn:");
				double money=sc.nextDouble();
				double bal=barr[i].getbalance();
				if(money<bal) {
					double newbal=bal-money;
					barr[i].setbalance(newbal);
					System.out.println("succesful withdraw/////////////");
					break;
				}
				else {
					System.out.println("Insufficient money!");
				}
				
			}
		if(i>barr.length && i!=acc-1) {
			System.out.println("No such user!");
		}
			
	}
		
		
		
	}
	public static void checkBalance(BankAccount [] barr) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the account number:");
		int acc=sc.nextInt();
		for(int i=0;i<barr.length;i++) {
			if(i==acc-1) {
				System.out.println("Balance="+barr[i].getbalance());
			}
		}
	}
}
