package bean;

import java.util.Objects;

public class Item {
	private int itemID;
	private String name;
	private double price;
	private int storeID;
	
	public Item() {}

	public Item(int itemID, String name, double price, int storeID) {
		this.itemID = itemID;
		this.name = name;
		this.price = price;
		this.storeID = storeID;
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStoreID() {
		return storeID;
	}

	public void setStoreID(int storeID) {
		this.storeID = storeID;
	}
	
	@Override
	public String toString() {
		return "Item [itemID=" + itemID + ", name=" + name + ", price=" + price + ", storeID=" + storeID + "]";
	}
	@Override
	public int hashCode() {
		//Object.hash --> Áp dụng 'công thức' hashing để hash item id ra hashed value
		return Objects.hash(itemID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Item)) {
			return false;
		}
		Item that = (Item) obj;
		return getItemID() == that.getItemID();
	}

}
