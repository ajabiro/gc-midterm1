import java.util.Scanner;

public class CashPayments extends Payments{
	//Fields
		private double amountTender;
		private double changeDue;

		//Constructor
		public CashPayments(double subTotal, double total) {
			super(subTotal, total);
		}
		
		//Methods
		@Override
		public void pay() {
	
				Scanner scan = new Scanner(System.in);
				System.out.println("Please present payment ");
				this.amountTender = scan.nextDouble();
				printReceipt();
		
		}
	
		public double changeBack(double amountTender) {
			changeDue = amountTender - getTotal();
			return changeDue;	
		}

		public double getAmountTender() {
			return amountTender;
		}

		public void setAmountTender(double amountTender) {
			this.amountTender = amountTender;
		}

		public double getChangeDue() {
			return changeDue;
		}

		public void setChangeDue(double changeDue) {
			this.changeDue = changeDue;
		}

		@Override
		protected void printReceipt() {
			System.out.printf("%10s%33.2f%n", "Cash Amt", amountTender);
			System.out.printf("%7s%36.2f%n", "Total", getTotal());
			System.out.printf("%7s%36.2f%n", "Change", changeBack(amountTender));
			System.out.println("--------------------------------------------\n");
//			System.out.printf("%n%27s%n", "Thank You!");
			
		}

}