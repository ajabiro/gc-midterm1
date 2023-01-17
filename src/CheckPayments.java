import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPayments extends Payments {
	
	//fields
	private String checkNumber;
	public CheckPayments(double subTotal, double total) {
		super(subTotal, total);
	//this.checkNumber = checkNumber;
	
	}

	@Override
	public void pay() {
	
		while(true) {
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter your check number: ");
		 checkNumber = scnr.nextLine();
		
		//String checkNumber = "Check Number";
		Matcher pattern = Pattern.compile("\\d\\d\\d\\d").matcher(checkNumber);
		
		if (pattern.matches()) {
			printReceipt();
			break;
			
		}else {
			System.out.println("Please enter a valid check number");
		}
	}
}

	public void printReceipt() {
		System.out.printf("%10s%33.2f%n", "Check Amt", getTotal());
		System.out.printf("%7s%36.2f%n", "Change", 0.00);
		System.out.println("--------------------------------------------\n");
	//	System.out.printf("%n%27s%n", "Thank You!");
	}
	
}