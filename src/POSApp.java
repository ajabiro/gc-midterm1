import java.util.*;

public class POSApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String continued = ""; 
		ArrayList<Products> customerSelection = new ArrayList<>();
		
		System.out.println("Hello, welcome to Sweet Tooth!");
		System.out.println("Please review our menu below!");
		do {
		printList(productList());
		System.out.println("Enter the menu number of the item wanted (1-13): ");
		int userInput = scnr.nextInt()-1;
		int userIndex = userInput +1;
		Products prod = productList().get(userInput);
		
		
		System.out.println("You chose menu number " + userIndex + " a " + prod.getName()) ;
//		if((userInput < 0) && (userInput > 13 )) {
		System.out.println("How many would you like to order?");
//		}else {
//			System.out.println("Sorry, that is not on the menu.");
//		}
		int orderAmount = scnr.nextInt();
		//this is where we will subtract the menu amount
		scnr.nextLine();
		for (int i = 0; i < orderAmount; i++) {
			
			customerSelection.add( prod);
		}
		
		System.out.println("The current subtotal is: " + "$" + orderAmount * prod.getPrice());
		
		System.out.println("Would you like to order anything else? (Y/N)");
		continued = scnr.nextLine();
		double subTotal = 0;
		double salesTax = 0;
		double total = 0;
		
		if(continued.equalsIgnoreCase("n")) {
	
			for(Products item : customerSelection) {
				subTotal += item.getPrice();
			
			salesTax = subTotal * .06;
			total = salesTax + subTotal;
			}
			
			System.out.println("Your subtotal is: " + subTotal);
			System.out.println("Sales Tax: " + salesTax);
			System.out.println("Total: " + total);
		}
		
		System.out.println("How would you like to pay?");
		System.out.println("Cash, Check, or Credit Card?");
		

		String paymentOptions = scnr.next();
		switch(paymentOptions.toLowerCase()) {
			case "cash":
				CashPayments dollar  = new CashPayments(subTotal, total); 
				dollar.pay();
				break;
			case "check":
				CheckPayments checkPay = new CheckPayments(subTotal,total);
				checkPay.pay();
			case "credit card":
				CreditPayments cardPay = new CreditPayments(subTotal, total);
				cardPay.pay();
				break;
		}
		
	}while(continued.equalsIgnoreCase("y"));
		
	}	
	//ArrayList method that stores products
		public static  ArrayList<Products> productList() {
			ArrayList<Products> list = new ArrayList<>();
			Products vGlazed = new Products(1, "Vernor's" , "Cake donut with Vernor's glaze", "Donuts ", 1.50, 50);
			list.add(vGlazed);
			Products cream = new Products(2, "Detroit Cream", "Our local take on the Boston cream ", "Donuts", 1.50, 50);
			list.add(cream);
			Products powdered = new Products(3, "Powdered", "Cake donut with powdered sugar", "Donuts", 1.50, 40);
			list.add(powdered);
			Products blueberry = new Products(4, "Blueberry", "Cake donut with real blueberries", "Donuts", 1.50, 60);
			list.add(blueberry);
			Products birthdayCake = new Products(5, "Birthday Cake", "Cake donut with birthday sprinkles and frosting", "Donuts", 1.60, 40);
			list.add(birthdayCake);
			Products sCoffee = new Products(6, "Small Coffee", "Plain black coffee", "Beverages", 2.50, 100);
			list.add(sCoffee);
			Products lCoffee = new Products (7, "Large Coffee", "Plain black coffee", "Beverages", 3.50, 100);
			list.add(lCoffee);
			Products sLatte = new Products (8, "Small Latte", "Espresso with milk and flavored syrup", "Beverages", 3.00, 100 );
			list.add(sLatte);
			Products lLatte = new Products (9, "Large Latte", "Espresso with milk and flavored syrup", "Beverages", 4.00, 100);
			list.add(lLatte);
			Products sCappuccino = new Products (10, "Small Cappuccino", "Espresso with steamed milk and foam", "Beverages", 3.00, 100);
			list.add(sCappuccino);
			Products lCappuccino = new Products (11, "Large Cappuccino", "Espresso with steamed milk and foam", "Beverages", 4.00, 100);
			list.add(lCappuccino);
			Products sMocha = new Products (12, "Small Mocha", "Espresso with steamed milk and chocolate", "Beverages", 3.00, 100);
			list.add(sMocha);
			Products lMocha = new Products (13, "Large Mocha", "Espresso with steamed milk and chocolate", "Beverages", 4.00, 100);
			list.add(lMocha);

			return list;
		}
		//this is where we format the list to make it look nice
		// make it look like a menu put $
		// can also do it in the To-String section up to you
		public static void printList(ArrayList<Products> list) {
			//this below just prints the top part need to figure out how to line it up %?
			System.out.println("\tCategory\tItem Name\tDescription\tPrice");
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getMenuNumber() + ". "  + list.get(i).getCategory() + ": " + list.get(i).getName() + " - " + list.get(i).getDescription() + " $" + list.get(i).getPrice());
		
			}
		}
		
		
}
