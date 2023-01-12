import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckPayments extends Payments {
	
	

	//fields
	//private int checkNumber;

	public CheckPayments(double subTotal, double taxRate, double total) {
	super(subTotal, taxRate, total);
	//this.checkNumber = checkNumber;
	
	
	}

	@Override
	public void pay() {
	
		System.out.println("Please enter your check number: ");
		Scanner scnr = new Scanner(System.in);
		
		String checkNumber = "Check Number";
		Pattern pattern = Pattern.compile("(\\d{4})");
		
	}
	public void printReceipt() {
		System.out.printf("%10s%33.2f%n", "Check Amt", getTotal());
		System.out.printf("%7s%36.2f%n", "Change", 0.00);
		System.out.println("--------------------------------------------\n");
		System.out.printf("%n%27s%n", "Thank You!");

	}

	
}