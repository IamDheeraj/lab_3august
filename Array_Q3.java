/*Q.3) Write a program that asks the user to input ten integers and stores them in an array.

 The program should then find and print the smallest and largest values in the array.*/


package lab;   

import java.util.Scanner;  // importing util class

public class Array_Q3 {
	int arr[]=new int[10];  // creating array size of ten integers 
	int i,greater,smaller;  // declaration of variables 
	Scanner sc =new Scanner(System.in);
	
	public void input()     // creating input method
	{
		System.out.println("Enter 10 number : ");
		for( i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();  // taking input from the user 
		}
		System.out.print("Your numbers are :");
		for(i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");  // printing output 
		}
	}
	public void smaller()     //creating method for find out smaller number
	{
		smaller=arr[0];
		for(i=0;i<arr.length;i++) {  // for loops and implementing logic for smaller number
			if(smaller>arr[i]) {
				smaller=arr[i];
			}
		}
		System.out.println("\nSmaller number is : "+smaller);
	}
	
	public void greater()    //creating method for find out greater number
	{
	    greater=arr[0];
		for(i=0;i<arr.length;i++) {  // for loops and implementing logic for greater number
			if(greater<arr[i]) {
				greater=arr[i];
			}
		}
		System.out.println("Greater number is : "+greater);  // printing output for greater number
	}

	public static void main(String[] args) {    // Here's main method of our class 
		Array_Q3 obj=new Array_Q3();        // creating object of class 
		obj.input();      // calling input method 
		obj.smaller();    // calling smaller method
		obj.greater();    // calling greater method
 
	}

}
