import java.util.*;

public class POSApp {


	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String continued = "";
		double subTotal = 0;
		double salesTax;
		double total = 0;
		int inventory = 0;
		int userInput = 0;
		int userIndex = 0;
		int orderAmount;
		//boolean repeat = true;
		Products prod = productList().get(userInput);
		
	//	SweetCoin sweet = new SweetCoin(total, total);
		ArrayList<Products> customerSelection = new ArrayList<>();
				
		System.out.println("Hello, welcome to Sweet Tooth!");
		System.out.println("Please review our menu below!");
		
		do {
			   do{
				   try {
				
		printList(productList());
		System.out.println("Enter the menu number of the item wanted (1-13): ");
		userInput = scnr.nextInt()-1;
		userIndex = userInput +1;
		prod = productList().get(userInput);
		System.out.println("You chose menu number " + userIndex + " a " + prod.getName()) ;
				   }catch(Exception ex) {
					   System.out.println("That item does not exist. ");
					   System.out.println("Enter the menu number of the item wanted (1-13): ");
						userInput = scnr.nextInt()-1;
						userIndex = userInput +1;
						prod = productList().get(userInput);
						System.out.println("You chose menu number " + userIndex + " a " + prod.getName()) ;
				   }
				   
		
				   
		System.out.println("How many would you like to order?");
		orderAmount = scnr.nextInt();
		scnr.nextLine();
		
		for (int i = 0; i < orderAmount; i++) {
			inventory=prod.getAmountOfProduct()-1;
			customerSelection.add( prod);
			prod.setAmountOfProduct(inventory);
			
			
		}
		
		if( orderAmount > inventory) {
			System.out.println("Sorry, we do not have " + (orderAmount) + " of the " + prod.getName() + " at the moment");
			
			System.out.println("How many would you like to order?");
			orderAmount = scnr.nextInt();
			scnr.nextLine();
			
			for (int i = 0; i < orderAmount; i++) {
				inventory=prod.getAmountOfProduct()-1;
				customerSelection.add(prod);
				prod.setAmountOfProduct(inventory);
			}
			
		}
		
		System.out.println("Remaining amount of " + prod.getName() +" " +  inventory);
		System.out.println("The current subtotal is: " + "$" + orderAmount * prod.getPrice());
		System.out.println("Would you like to order anything else? (Y/N)");
		 continued = scnr.nextLine();
		 subTotal = 0;
		 salesTax = 0;
		 total = 0;
		
		if(continued.equalsIgnoreCase("n")) {
		//	sweet.pay();
	
			for(Products item : customerSelection) {
				subTotal += item.getPrice();
	
			salesTax = subTotal * .06;
			total = salesTax + subTotal;
			}
		
			
			System.out.println("Your subtotal is: " + Math.round(subTotal * 100)/100.0);
			System.out.println("Sales Tax: " + Math.round(salesTax * 100)/100.0);
			System.out.println("Total: " +Math.round(total * 100)/100.0);
		} 
			
		}while(continued.equalsIgnoreCase("y")); 
				   
			   
		System.out.println("How would you like to pay?");
		System.out.println("Cash, Check, or Credit Card?");
		//System.out.println(prod.getName());
		String paymentOptions = scnr.next();
		switch(paymentOptions.toLowerCase()) {
			case "cash":
				CashPayments dollar  = new CashPayments(subTotal, total); 
				dollar.pay();
				break;
			case "check":
				CheckPayments checkPay = new CheckPayments(subTotal,total);
				checkPay.pay();
				break;
			case "creditcard":
				CreditPayments cardPay = new CreditPayments(subTotal, total);
				cardPay.pay();
				break;
	//		case "sweetcoin":
	//			SweetCoin coin = new SweetCoin(subTotal, total);
	//			coin.pay();
	//			break;
		}
		receipt(total, subTotal, paymentOptions, customerSelection);
	  }while(continued.equalsIgnoreCase("y"));
	
	}	

	// visa card Visa 4155279860457
	
	public static void receipt(double total, double subTotal, String paymentOptions, ArrayList<Products> prod) {
		System.out.println(" Sweet Tooth \n 1234 Main St \n Detroit, MI 48000 \n 333-333-3333" );
		
		System.out.println(" ");
		System.out.println("Terminal ID: ****27");
		System.out.printf("%10s%33s%n", "Date", "2023-01-18");
		System.out.println(" ");
		System.out.printf("%-15s %s \n", "Item", "Price");
	    System.out.println("========================");
	
	  		ArrayList<Products> customerSelection = prod;
			for (int i = 0; i < customerSelection.size(); i ++) {
	  	   
	  	       System.out.printf("%-15s $%.2f \n", customerSelection.get(i).getName(), customerSelection.get(i).getPrice());
	  		
		System.out.println("~~~~~~~~~~~~");
			}
			System.out.println("\nPayment Method: " + paymentOptions);
			System.out.printf("Subtotal: $%.2f", subTotal);
			System.out.printf("\n" + "Total: $%.2f", total);
			System.out.println(" ");
			System.out.println("Thank you for your business!");
	}

	//ArrayList method that stores products
		public static  ArrayList<Products> productList() {
			ArrayList<Products> list = new ArrayList<>();
			Products vGlazed = new Products(1, "Vernors" , "Cake donut with Vernors glaze ", "Donuts", 1.50, 50);
			list.add(vGlazed);
			Products cream = new Products(2, "Detroit Cream", "Our local take on the Boston cream ", "Donuts", 1.50, 50);
			list.add(cream);
			Products powdered = new Products(3, "Powdered", "Cake donut with powdered sugar ", "Donuts", 1.50, 40);
			list.add(powdered);
			Products blueberry = new Products(4, "Blueberry", "Cake donut with real blueberries ", "Donuts", 1.50, 60);
			list.add(blueberry);
			Products birthdayCake = new Products(5, "Birthday Cake", "Cake donut with birthday sprinkles and frosting ", "Donuts", 1.50, 40);
			list.add(birthdayCake);
			Products sCoffee = new Products(6, "Small Coffee", "Plain black coffee ", "Beverages", 2.50, 100);
			list.add(sCoffee);
			Products lCoffee = new Products (7, "Large Coffee", "Plain black coffee ", "Beverages", 3.50, 100);
			list.add(lCoffee);
			Products sLatte = new Products (8, "Small Latte", "Espresso with milk and flavored syrup ",  "Beverages", 3.00, 100 );
			list.add(sLatte);
			Products lLatte = new Products (9, "Large Latte", "Espresso with milk and flavored syrup ", "Beverages", 4.00, 100);
			list.add(lLatte);
			Products sCappuccino = new Products (10, "Small Cappuccino", "Espresso with steamed milk and foam ", "Beverages", 3.00, 100);
			list.add(sCappuccino);
			Products lCappuccino = new Products (11, "Large Cappuccino", "Espresso with steamed milk and foam ", "Beverages", 4.00, 100);
			list.add(lCappuccino);
			Products sMocha = new Products (12, "Small Mocha", "Espresso with steamed milk and chocolate ", "Beverages", 3.00, 100);
			list.add(sMocha);
			Products lMocha = new Products (13, "Large Mocha", "Espresso with steamed milk and chocolate ", "Beverages", 4.00, 100);
			list.add(lMocha);

			return list;
		}
		public static void printList(ArrayList<Products> list) {
			System.out.println(" ");
			System.out.printf("%-15s %-11s %-16s %-51s  %s\n","Menu Number", "Category",  "Name", " Description", "Price");
			for(int i = 0; i < list.size(); i++) {
				System.out.printf("%-15s %-11s %-17s %-50s  $%-5.2f\n", list.get(i).getMenuNumber() ,   list.get(i).getCategory() , list.get(i).getName(), list.get(i).getDescription(), list.get(i).getPrice());
			}
			
		}
		

		
}