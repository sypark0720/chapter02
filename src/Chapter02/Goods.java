package Chapter02;

public class Goods {
	
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	//@Override라고 여기에 치면 error남(override된 게 아니니까)
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", countStock="
				+ countStock + ", countSold=" + countSold + "]";
	}
	
	/*
	@Override //anotation(additional information)
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", countStock="
				+ countStock + ", countSold=" + countSold + "]"; */
	
	
	}

