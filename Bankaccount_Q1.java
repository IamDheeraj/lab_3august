package lab;

import java.util.Scanner;

public abstract class Bankaccount_Q1 {
	   static Scanner sc=new Scanner(System.in);
	   //Declaration of all variables
	   static	int check_pin,check_pin2,set_account_number,amount,repeat,num1,balance=0; 
	   private int accountNumber,pin; // private variables 
	
	   abstract void deposite();     // abstract method
	   abstract void withdraw();     // abstract method
	   
	//creating getter and setter for account number and pin number   
	   
	public int getAccountNumber() {     // this for account number 
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {  // this for account number 
		this.accountNumber = accountNumber;
	}
	 public int getPin() {         // this for pin number 
		return pin;
	}
	public void setPin(int pin) {  // this for pin number 
		this.pin = pin;
	}
	   
	   
	   
	}