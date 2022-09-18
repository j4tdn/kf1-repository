package online.exercises;

public class Transaction {
	private Trader trader;
	private int year;
	private double value;
	public Transaction() {}
	public Transaction(Trader trader, int year, double value) {
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	public Trader getTrader() {
		return trader;
	}
	public void setTrader(Trader trader) {
		this.trader = trader;
	}
	public String getTraderCity() {
		return trader.getCity();
	}
	public void setTraderCity(String city) {
		this.trader.setCity(city);
	}
	public String getTraderName() {
		return trader.getName();
	}
	public void setTraderName(String name) {
		this.trader.setName(name);
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Transaction [trader=" + trader + ", year=" + year + ", value=" + value + "]";
	}
	
	
}
