/*
* PayoffDebt.java
* Author: JiaoAng Dong 
* Submission Date: 9/5/19
*
* Purpose: This program calculates the total amount
* needed to pay off the credit card considering that
* there are interest rates. The user simply need to 
* input the amount need to be paid off, the interest rate,
* and how much he/she will pay every month. He will get how many
* months he needs to pay and what the total is.
*
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance with
* the University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based
* on an assignment created by the Department of Computer
* Science at the University of Georgia. Any publishing
* or posting of source code for this project is strictly
* prohibited unless you have written consent from the Department
* of Computer Science at the University of Georgia.
*/
  import java.util.Scanner;

  public class PayoffDebt {

	  public static void main(String[] arg){
	
	  Scanner keyboard = new Scanner (System.in);
	  
	  System.out.print("what is the principal?");
	  double principal = keyboard.nextDouble();
	  
	  System.out.print("what is the annual interest rate?");
	  double interest = keyboard.nextDouble();
	  
	  System.out.print("what is the monthly payment?");
	  double monthlypayment = keyboard.nextDouble();
	  
	  double part1 = Math.log(monthlypayment);
	  double part2 = Math.log(monthlypayment-(interest/1200.0) * principal);
	  double part3 = Math.log((interest/1200.0)+1.0);
	  double rawmonthsneeded = ((part1-part2)/part3);
	  
	  double monthsneeded = Math.ceil(rawmonthsneeded);
	  
	  double totalamount = monthsneeded*monthlypayment ;
	  
	  double totalinterest = totalamount - principal ;
	  
	  double overpayment = totalamount - (rawmonthsneeded*monthlypayment);
	  
	  int newmonths = (int)monthsneeded;
	  
	  System.out.printf("\nPrincipal:\t\t\t%.2f", principal);
	  System.out.println("\nAnnual Interest Rate (%):\t" + interest );
	  System.out.printf("Monthly Payment:\t\t%.2f" , monthlypayment);
	  System.out.println("\n\nMonths Needed To Pay Off:\t" + newmonths);
	  System.out.printf("Total Amount Paid:\t\t$%.2f", totalamount);
	  System.out.printf("\nTotal Interests Paid:\t\t$%.2f", totalinterest);
	  System.out.printf("\nOverpayment:\t\t\t$%.2f",overpayment);
	  
		  
	  keyboard.close();
	  }
	  
	  
}
