package lab;
class Checkingaccount_Q1 extends Bankaccount_Q1
	{
	public static void main(String[] args) {    // main method of the program
        Checkingaccount_Q1 r = new Checkingaccount_Q1();  // creating object of the class 
        
        System.out.println("Generate Account number and Pin number ");
        r.details();     // calling details method 
        
        do {              // do while loops 
        System.out.println("1 : Deposite\n");
        System.out.println("2 :Withdraw\n");
        num1=sc.nextInt();
        	
        switch(num1) {    // implementing switch case 
        case 1:
        r.deposite();  // calling deposite method 
        break;
        
        case 2 :
        r.withdraw(); // calling withdraw method 
        break;
        
        default :
        	System.out.println(" invalid choice... ");   // this default value
        }
        System.out.println("\nDo you want perform Again");
        System.out.println("1 : Yes");
        System.out.println("2 : No");
        repeat=sc.nextInt();
        }while(repeat==1);
        
        System.out.println("Thank you ");   // last massage of the program
	}
	
	public void details() {
		System.out.println("\nEnter Account number: ");
		set_account_number = sc.nextInt();
		setAccountNumber(set_account_number);
		System.out.println("Create Pin number: ");
		check_pin = sc.nextInt();
		setPin(check_pin);
		System.out.println("What you want Do\n");
	}
	
	@Override
	    public void deposite()          // heres deposit method and using from abstract class
	    {
		    verify();
		    
		   // heres we verifying pin number
	    	if(getPin()==check_pin && getPin()==check_pin2) {
	    	System.out.println("Enter amount to add ");
	    	amount=sc.nextInt();
	    	balance+=amount;
	    	System.out.println("\nYour total balance is : Rs "+balance);
	    	}
	    	else {
	    		System.out.println("Wrong pin number\nTry  Again...");
	    	}
	    }
	    
	    @Override   
	    public void withdraw()    // heres withdraw method and using from abstract class 
	    {
	    	verify();
	    	
	    	// heres we verifying pin number
	    	if(getPin()==check_pin && getPin()==check_pin2) {
	    	System.out.println("Enter Amount to withdraw ");
	    	amount=sc.nextInt();
	    	if(amount<=balance)
	    	{
	    		balance-=amount;
	    		System.out.println(amount+" Rs debited from your account");
	    		System.out.println("\nYour total balance is : Rs "+balance);
	    	}
	    	else
	    	{
	    		System.out.println("\ninsufficient balance! ");
	    	}
	    	}
	    	else {
	    		System.out.println("Wrong pin number\nTry Again...");
	    	}
	    	
	    }
	    // creating verify method 
	    public void verify() {
	    	System.out.println("Enter pin number");
		    check_pin2=sc.nextInt();
	    }
	}
