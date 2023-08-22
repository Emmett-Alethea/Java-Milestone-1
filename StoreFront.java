package app;
import java.util.Scanner;

public class StoreFront{ 
private static Inventory list = new Inventory();
private static Cart cart = new Cart();
//purchase moves item to cart and updates quantity of item
	//cancel removes item from cart and updates quantity
	public static void purchase(Product item) {
		list.addCart(item); // affects inventory quantity
		cart.addCart(item); // adds item to cart arrayList
		//updateDisplay();
	}
	public static void cancel(Product item) {
		list.removeCart(item); //inventory quantity
		cart.removeCart(item); // cart 
		//updateDisplay();
	}
	
	public static void updateDisplay() {
		list.displayInventory();
	}
	public static void updateCart() {
		cart.displayCart();
	}
	public static void main (String[]args) {
		list = new Inventory();
		list.displayInventory();
		Scanner input = new Scanner(System.in);
		String selected = "m";
		
		while (selected.equals("p") != true) {
		System.out.println("Type in the name of the item, or press p to end"); //start of purchase
		selected = input.next();
		
		if (selected.equals("a")) {
			System.out.println("Would you like to purchase one of these items? y/n");
			selected = input.next();
			
			if (selected.equals("n")) {
				continue;
			}
			if (selected.equals("y")) {
				purchase(list.getItem(0));
				System.out.println("Item a has been added to cart");
				updateCart();
			}
		}
		else if (selected.equals("c")) {
			System.out.println("Would you like to purchase one of these items? y/n");
			selected = input.next();
			if (selected.equals("y")) {
				purchase(list.getItem(1));
				System.out.println("Item c has been added to cart");
				updateCart();
				
			}
			else if (selected.equals("n")) {
				continue;
		} // end of purchase
		}
		else if (selected.equals("p")) {
			continue;
		}
		else {
			System.out.println("Please select an item");
			continue;
		}
		System.out.println("Would you like to buy another item, or would you like to return something. Purchase: r, cancel: c");
		selected = input.next();
		if (selected.equals("c")) {
			System.out.println("Type in the name of the item");
			selected = input.next();
			if (selected.equals("a")) {
				System.out.println("Would you like to return one of these items? y/n");
				selected = input.next();
				if (selected.equals("y")) {
					cancel(list.getItem(0));
					System.out.println("Item a has been removed from cart");
					updateCart();
				}
				else if (selected.equals("n")) {
						continue;
				}
			}
			else if (selected.equals("c")) {
				System.out.println("Would you like to return one of these items? y/n");
				selected = input.next();
				if (selected.equals("y")) {
					cancel(list.getItem(1));
					System.out.println("Item c has been removed from cart");
					updateCart();
				}
				else if (selected.equals("n")) {
					continue;
		}
	}
	}
		else if (selected.equals("r")) {
			updateDisplay();
			//selected = input.next();
			continue;
		}
}
		System.out.println("Goodbye!");
		}
		
	}

