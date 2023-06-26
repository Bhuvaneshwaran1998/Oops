package inheritance;

public class MultiMobile {
	String brand;
	int price;
	String model;
	
	public MultiMobile(String brand, int price, String model) {
		super();
		this.brand = brand;
		this.price = price;
		this.model = model;
	}


	@Override
	public String toString() {
		return "MultiMobile [brand=" + brand + ", price=" + price + ", model=" + model + "]";
	}
	
	

}
