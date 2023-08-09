package lab;

import java.util.Scanner;

public class Bank_process_Q4 {
	
    // Creating a Scanner object for user input
    static Scanner sc=new Scanner(System.in);
    
    // Declaration of instance variables
	private int password;
	int amount,amount2,time,process,balance=1000,pin,pin2;
	float interest;
	String bank_name,user_name,account_type,account_num;
	
	// Getter method for password
	public int getPassword() {
		return password;
	}

    // Setter method for password
	public void setPassword(int password) {
		this.password = password;
	}

    // Method to accept user details
	public void acceptDetails() {
		System.out.print("Enter bank name : ");
		bank_name=sc.nextLine();
		System.out.print("Account type : ");
		account_type=sc.nextLine();
		System.out.print("User name : ");
		user_name=sc.nextLine();
		System.out.println("Account number : ");
		account_num=sc.nextLine();
		System.out.println("Create pin : ");
		pin=sc.nextInt();
		setPassword(pin);
	}
	
    // Method to display user details
	public void details() {
		System.out.println("Your bank name : "+bank_name);
		System.out.println("Account type   : "+account_type);
		System.out.println("Your user name : "+user_name);
		System.out.println("Your Account number : "+account_num);
		System.out.println("Your pin  : "+getPassword());
	}
	
    // Method to deposit money into the account
	public void deposite() {
		verify();
	    
	    if(getPassword()==pin2) {
	    	System.out.println("Enter Amount to add ");
	    	amount=sc.nextInt();
	    	balance+=amount;
	    	System.out.println("\nYour total balance is : Rs "+balance);
	    }
	    else {
	    	System.out.println("Wrong Password...\nTry  Again...");
	    }
	}
	
    // Method to withdraw money from the account
	public void withdraw() {
		verify();
    	
    	if(getPassword()==pin2) {
	    	System.out.println("Enter Amount to withdraw ");
	    	amount=sc.nextInt();
	    	if(amount<=balance) {
	    		balance-=amount;
	    		System.out.println(" Rs "+amount+" Debited from your account");
	    		System.out.println("\nYour total balance is : Rs "+balance);
	    	}
	    	else {
	    		System.out.println("\ninsufficient balance! ");
	    	}
	    }
	    else {
	    	System.out.println("Wrong Password... \nTry Again...");
	    }
	}

    // Method to check account balance
	public void check_balance() {
		verify();
		if(getPassword()==pin2) {
	    	System.out.println("Your total balance is : "+balance);
	    }
	    else {
	    	System.out.println("Wrong Password... \nTry Again...");
	    }
	}
	
    // Method to inquire about a loan
	public void loan() {
		System.out.println("Enter Amount for loan ");
		amount2=sc.nextInt();
		
		if(amount2>=100000) {
			time();
			
			if(time<=3) {
				interest=((amount2*time*15)/100)+amount2;
				System.out.println("Interest rate for Rs "+amount2+" is 15%\n");
				System.out.println("Total Amount with interest rate is : "+interest+"\n");
			}
			else if(time>3) {
				interest=((amount2*time*9)/100)+amount2;
				System.out.println("Interest rate for Rs "+amount2+" is 9%\n");
				System.out.println("Total Amount with interest rate is : "+interest+"\n");
			}
		}
		else if(amount2>=50000){
			time();
			
			if(time<=3) {
				interest=((amount2*time*10)/100)+amount2;
				System.out.println("Interest rate for Rs "+amount2+" is 10%\n ");
				System.out.println("Total Amount with interest rate is : "+interest+"\n");
			}
			else if(time>3) {
				interest=((amount2*time*13)/100)+amount2;
				System.out.println("Loan for RS "+amount2+" and interest rate is 13% ");
				System.out.println("Total Amount with interest rate is : "+interest+"\n");
			}
		}
		else {
			System.out.println("We are not providing loan for less than RS 50,000 amount");
			System.out.println("Sorry... :) ");
		}
	}
	
    // Method to verify PIN
	public void verify() {
		System.out.println("Enter pin");
		pin2=sc.nextInt();
	}
	
    // Method to input loan duration
	public void time() {
		System.out.println("How many years for ");
		time=sc.nextInt();
	}
	
	public static void main(String[] args) {
		Bank_process_Q4 obj=new Bank_process_Q4();
		obj.acceptDetails();
		
		System.out.println("What you want to do\n");
		System.out.println("1: Show My Details ");
		System.out.println("2: Deposite ");
		System.out.println("3: Withdraw ");
		System.out.println("4: Check Balance ");
		System.out.println("5: Loan Inquiry ");
		
		int process=sc.nextInt();
		
		switch(process) {
			case 1:
				obj.details();
				break;
			
			case 2:
				obj.deposite();
				break;
			
			case 3:
				obj.withdraw();
				break;
			
			case 4:
				obj.check_balance();
				break;
				
			case 5:
				obj.loan();
				break;
		}
	}
}
