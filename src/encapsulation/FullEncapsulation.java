package encapsulation;

public class FullEncapsulation {
	private String brand;
	private int price;
    private String colour;
    private boolean isweterProof;
	public FullEncapsulation(String brand, int price, String colour, boolean isweterProof) {
		super();
		this.brand = brand;
		this.price = price;
		this.colour = colour;
		this.isweterProof = isweterProof;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public boolean isIsweterProof() {
		return isweterProof;
	}
	public void setIsweterProof(boolean isweterProof) {
		this.isweterProof = isweterProof;
	}
	
	@Override
	public String toString() {
		return "FullEncapsulation [brand=" + brand + ", price=" + price + ", colour=" + colour + ", isweterProof="
				+ isweterProof + "]";
	}
    
    
}
