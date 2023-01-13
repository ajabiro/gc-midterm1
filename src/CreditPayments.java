import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditPayments extends Payments{
	Scanner scan = new Scanner(System.in);

	/*Test Case Card Numbers:
	 *Visa 4155279860457
	 *Amex 3700 0000 0000 002
	  Discovery 6011 6011 6011 6611	
	   JCB 3569 9900 1009 5841	
	   Mastercard 5555 3412 4444 1115
	   	**/
	
	//fields
	protected String creditCardNumber;
	protected String expirationDate;
	protected String cvv;
	protected String nameInput;
	//Pattern pat = Pattern.compile("[0-9]");
	
	
	/*Constructor*/
	public CreditPayments(double subTotal, double taxRate, double total) {
	super(subTotal, taxRate, total);
	this.creditCardNumber = creditCardNumber;
	this.expirationDate = expirationDate;
	this.cvv = cvv;
	
	}
	
	
	
	/*Pay method from Payment class*/
	@Override
	public void pay() {
		
		System.out.println("Please enter the name on the card: ");
		nameInput = scan.nextLine();
		
		/*If nothing is entered*/
		while(nameInput.isEmpty()) {
			System.out.println("Please enter the name on the card: ");
			nameInput = scan.nextLine();
			
		}
		
		/*Asking for card number input */
		System.out.println("Please enter Card Number: ");
		creditCardNumber = scan.nextLine();
		
		/*This is a regular Expression that validates card by type 
		 * and format*/
		String CardValidationregex = "^(?:(?<visa>4[0-9]{12}(?:[0-9]{3})?)|" +
			    "(?<mastercard>5[1-5][0-9]{14})|" +
			    "(?<discover>6(?:011|5[0-9]{2})[0-9]{12})|" +
			    "(?<amex>3[47][0-9]{13})|" +
			    "(?<diners>3(?:0[0-5]|[68][0-9])?[0-9]{11})|" +
			    "(?<jcb>(?:2131|1800|35[0-9]{3})[0-9]{11}))$";
		
		//The Pattern class is a class that supports regular expression (regex)
		Pattern pattern = Pattern.compile(CardValidationregex);
		
		//Strip all hyphens and spaces 
		creditCardNumber = creditCardNumber.replaceAll("-", ""); 
		creditCardNumber = creditCardNumber.replaceAll(" ", ""); 
		
		/*The Matcher class is a class that supports regular expression (regex)*/
		Matcher matcher = pattern.matcher(creditCardNumber);
		
		/*If the creditCardNumber does not match the pattern, it will loop */
		while(!matcher.matches()) {
			System.out.println("Please enter Card Number: ");
			creditCardNumber = scan.nextLine();
		}
		
		
		/*cvv input*/
		System.out.println("Please enter your secure code (The three digits on the back of your card):");
		cvv = scan.nextLine();
		
		/*^ represents the starting of the string. 
		 * [0-9] represents the digit between 0-9.
		 * {3, 4} represents the string that has 3 or 4 digits.
		 *$ represents the ending of the string.
		 */
		String regExCvv = "^[0-9]{3,4}$";
		
		/*Follow the same steps as CC validation*/
		Pattern cvvRegPattern = Pattern.compile(regExCvv);
		
		Matcher ccvRegMatcher = cvvRegPattern.matcher(cvv);
		while (!ccvRegMatcher.matches()) {
			System.out.println("Invalid Security Code please enter again:");
			cvv = scan.nextLine();
			ccvRegMatcher = cvvRegPattern.matcher(cvv);
		}
		
		
		/*Expiration date input*/
		System.out.println("Please enter Expiration Date MM/YY: ");
		expirationDate = scan.nextLine();
		
		/*Regex validation for expiration date
		 * \\d is for the digit 
		 * {4} represents the amount of digits, like the year
		 * {2} represents the month
		 * {2 represents the day}*/
		String expireDateRegEx = "\\d{4}-\\d{2}-\\d{2}";
		
		/*Follow the same steps as CC validation*/
		Pattern expireDateRegExPattern = Pattern.compile(expireDateRegEx);
		expirationDate = expirationDate.replaceAll("/", "");
		//expirationDate = expirationDate.replaceAll("-", "");
		//expirationDate = expirationDate.replaceAll(".", "");
		
		Matcher expirationDateMatcher = expireDateRegExPattern.matcher(expirationDate);
		while (!expirationDateMatcher.matches()) {
			System.out.println("Invalid Expiration Date please enter again: ");
			expirationDate = scan.nextLine();
			expirationDateMatcher = expireDateRegExPattern.matcher(expirationDate);

		}
	}
	
	
	/*Have to create a method that prints the receipt */
	
	public void printReceipt() {
		/*An abstract method was created in the parent class*/
		super.printReceipt();
		
		/*%12 is for 12 spaces
		 * s is for String
		 * %f is floating point
		 * %n is for new line
		 *A substring is basically used to extract a part of a String 
		 *String = timeless  substring = time or less both can
		 *be extracted from a string */
		System.out.printf("%12s%31.2f%n", "Credit Tend", total);
		System.out.printf("%10s%33s%n", "Account #", "************" + (creditCardNumber.substring(creditCardNumber.length() - 4)));
		System.out.println("--------------------------------------------\n");
		System.out.printf("%n%27s%n", "Thank You! " + nameInput);

	}
	
	
	
	/*Each credit card company uses a number format*/
	
	/*American Express : 15 digits, starting with 34 or 37.*/
	public String americanExpress(String aCard) {
		
		return aCard;
		
	}
	
	/*Diners Club : 14 digits, starting with 300 through 305, 36, or 38.*/
	public String dinnerClub(int dnCard) {
		return creditCardNumber;
		
	}
	
	/*Discover : 16 digits, starting with 6011 or 65.*/
	public String discover(int dCard) {
		return creditCardNumber;
		
	}
	
	/*JCB : 15 digits, starting with 2131 or 1800, or 16 digits starting with 35.*/
	public String jcb(int jCard) {
		return creditCardNumber;
		
	}
	
	/*MasterCard : 16 digits, starting with 51 through 55.*/
	public String masterCard(int mCard) {
		
		
		return null;
		

		
		
	}
	
	/*Visa : 13 or 16 digits, starting with 4.*/
	public String Visa(int vCard) {
		return creditCardNumber;
		
	}

	
	/*Getters Setters*/
	public String getCreditCardNum() {
		return creditCardNumber;
	}

	public void setCreditCardNum(String creditCardNum) {
		this.creditCardNumber = creditCardNum;
	}

	public String getExpDate() {
		return expirationDate;
	}

	public void setExpDate(String expDate) {
		this.expirationDate = expDate;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
}