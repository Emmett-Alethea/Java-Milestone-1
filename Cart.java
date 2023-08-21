package app;
import java.util.ArrayList;

public class Cart {
	private ArrayList<Product> cartList;
	public Cart() {
		cartList = new ArrayList<Product>();
	}
	public void addCart(Product item) {
	     cartList.add(item);
	}
	public void removeCart(Product item) {
		cartList.remove(item);
	}
	public void displayCart() {
		for (Product item: cartList) {
			item.displayProduct();
		}
		}
}
