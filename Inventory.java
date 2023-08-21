package app;
import java.util.ArrayList;


public class Inventory {
private ArrayList<Product> inventoryList;
public Inventory() {
	inventoryList = new ArrayList<Product>();
	// following items are for testing purposes
    Product itemA = new Product("a", "b", 12, 1.5);
	addItem(itemA);
	Product itemB = new Product("c", "d", 15, 2.7);
	addItem(itemB); 

}
public void addItem(Product item) {
	inventoryList.add(item);
}
public void removeItem(Product item) {
	inventoryList.remove(item);
}
public void changeQuantity(Product item, int change) { // decreases quantity by one
	int newQuantity = item.getQuantity() - change;
	item.setQuantity(newQuantity);
}
public void addCart(Product item) {
	changeQuantity(item, 1);
}
public void removeCart(Product item) {
	changeQuantity(item, -1);
}

public void displayInventory() {
	for (Product item: inventoryList) {
		item.displayProduct();
	}
}

public Product getItem(int i) {
	return inventoryList.get(i);
}
}