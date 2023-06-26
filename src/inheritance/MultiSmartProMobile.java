package inheritance;

public class MultiSmartProMobile extends MultiSmartMobile {
	String bettry;
	String capacity;
	


	@Override
	public String toString() {
		return super.toString()+ "[bettry=" + bettry + ", capacity=" + capacity + "]";
	}



	public MultiSmartProMobile(String brand, int price, String model, String touch, boolean iswireLess, String bettry,
			String capacity) {
		super(brand, price, model, touch, iswireLess);
		this.bettry = bettry;
		this.capacity = capacity;
	}



	public static void main (String[] args) {
		MultiSmartProMobile m=new MultiSmartProMobile("apple",40000,"7-puls","good",true,"amd","good");
		MultiSmartProMobile m1=new MultiSmartProMobile("mango",30000,"2-pro","not bad",true,"hsd","super");
		System.out.println(m+" "+m1);
	}
	

}
