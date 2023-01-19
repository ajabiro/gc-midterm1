import java.util.*;

//public class SweetCoin extends Payments{

	/*Fields*/
//	protected String memberName;
//	protected int memberNumber;
//	protected int memberCoin;
//	protected double memberDiscount;
//	protected double addSweetCoin;
//	
//	/*Constructor from parent class*/
//	public SweetCoin(double subTotal, double total) {
//		super(subTotal, total);
//	}
//	
//	/*Constructor for the member list*/
//	public SweetCoin(String memberName, int memberNumber,  int memberCoin) {
//		super(memberNumber, memberCoin);
//		this.memberName = memberName;
//		this.memberNumber = memberNumber;
//		this.memberCoin = memberCoin;
//		this.memberDiscount = memberDiscount;
//		this.addSweetCoin = addSweetCoin;
//	}
	
	
	
	
	/*Members Array*/
//	public static  ArrayList<SweetCoin> memberList(){
//		ArrayList<SweetCoin> members = new ArrayList<>();
//		SweetCoin Aranda = new SweetCoin("Aranda Jabiro", 4545 , 500);
//		members.add(Aranda);
//		SweetCoin Erika = new SweetCoin("Erika Kyles", 4546, 500);
//		members.add(Erika);
//		SweetCoin Akhirah = new SweetCoin("Akhirah Strong", 4547, 500);
//		members.add(Akhirah);
//		SweetCoin Frank = new SweetCoin("Frank Benzo", 4548, 500);
//		members.add(Frank);
//		SweetCoin Kelly = new SweetCoin("Kelly Benzo", 4549, 500);
//		members.add(Kelly);
//				
//		return members;
	//}



	/*Sweet Coin to cash converter*/
	/*Every Coin is worth 1 cent*/
	/*For every dollar spent customer gets 1 Sweet Coin*/
//	public double coinConverter(double dollarAmount) {
//		
//		double dollar = 1;
//		double sweetCoin = 1;
//		
//		for(double i = 0; i < dollar; i++) {
//			sweetCoin++;
//		}
//		
//		return sweetCoin;
//	}
//	
//	public double discount(double disc) {
//		 disc = this.total -5.0;
//		return disc;
//		
//	}
	
//	@Override
//	public void pay() {
//		Scanner scan = new Scanner(System.in);
//		ArrayList<SweetCoin>member = memberList();
//		double useDiscount = discount(0);
//		System.out.println("Are you a member? (Y/N)");
//		String userInputs = scan.nextLine();
//		if(userInputs.equalsIgnoreCase("Y")) {
//			System.out.println("Please enter you code: ");
//			int code = scan.nextInt();
//			scan.nextLine();
//			SweetCoin sweet = memberList().get(memberCoin);
//			System.out.println("Hello " + sweet.memberName + " you have " + sweet.memberCoin + " Sweet Coins!");
//			System.out.println(" ");
//		}else if(userInputs.equalsIgnoreCase("N")) {
//			System.out.println("Hit enter to continue.");
//			scan.nextLine();
//		}
//		
//		System.out.println("Would you like to use your Sweet Coins? (Y/N)");
//		String userInput2 = scan.nextLine();
//		
//		if(userInput2.equalsIgnoreCase("Y")) {
//			System.out.println(memberDiscount );
//		}else if(userInput2.equalsIgnoreCase("N")) {
//			System.out.println("Please hit enter to continue.");
//			scan.nextLine();
//		}
//		printReceipt();
//		scan.close();
//		
//	}
	
//	public void addSweetCoin() {
//		addSweetCoin = this.total + 1;
//	}
//	
//	
//
//	public int getMemberNumber() {
//		return memberNumber;
//	}
//
//	public void setMemberNumber(int memberNumber) {
//		this.memberNumber = memberNumber;
//	}
//
//	public int getMemberCoin() {
//		return memberCoin;
//	}
//
//	public void setMemberCoin(int memberCoin) {
//		this.memberCoin = memberCoin;
//	}
//
//	public void setMemberName(String memberName) {
//		this.memberName = memberName;
//	}
//	
//	public String getMemberName() {
//		return memberName;
//	} 
//	
//
//	@Override
//	public String toString() {
//		return "SweetCoin [memberName=" + getMemberName() + ", memberNumber=" + getMemberNumber() + ", memberCoin=" + getMemberCoin()
//				+ "]";
//	}

	/* Want to see how to integrate this into the app */
//	@Override
//	protected void printReceipt() {
//		
//		System.out.printf("%10s%33.2f%n", "You Sweet Coin Discoun is ", coinConverter(total) );
//		System.out.printf("%7s%36.2f%n", "Total", discount(total) );
//		//System.out.printf("%7s%36.2f%n", "Change", changeBack(amountTender));
//		System.out.println("--------------------------------------------\n");
//		System.out.printf("%n%27s%n", "Thank You!");
//		
	//}

//}