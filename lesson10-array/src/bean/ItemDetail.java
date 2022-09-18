package bean;

public class ItemDetail implements Comparable<ItemDetail> {
	private int itemID;
	private int storeID;
	private String name;
	private double price;
	public ItemDetail(int itemID, int storeID, String name, double price) {
		this.itemID = itemID;
		this.storeID = storeID;
		this.name = name;
		this.price = price;
	}
	public ItemDetail() {}
	
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public int getStoreID() {
		return storeID;
	}
	public void setStoreID(int storeID) {
		this.storeID = storeID;
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
	@Override
	public String toString() {
		return "\nItemDetail [itemID=" + itemID + ", storeID=" + storeID + ", name=" + name + ", price=" + price + "]";
	}
	@Override
	public int compareTo(ItemDetail o) {
		ItemDetail i1 = this;
		ItemDetail i2 = o;
		return Double.compare(i1.getPrice(), i2.getPrice());
	}
	
}
