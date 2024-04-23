package com.bankdemo;



public class BankAccount{
		
		private int accNo;
		private String name;
		private double balance;
		
		public static int counter=0;
		
		public BankAccount() {
			accNo=0;
			name="NA";
			balance=0;
		}
		public BankAccount(String name,double balance) {
			counter++;
			this.accNo=counter;
			this.name=name;
			this.balance=balance;
		}
		
		public double getbalance() {
			return this.balance;
		}
		public void setbalance(double balance) {
			this.balance=balance;
		}
		public String toString() {
			return "Account number: "+accNo+" | Name: "+name;
		}
		
		
}
