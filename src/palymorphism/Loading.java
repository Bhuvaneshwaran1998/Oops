package palymorphism;

public class Loading {
	
	public int pen(int price) {
		return price;
	}
	
	public float pen(int price, int discount) {
		return price-discount;
	}
	
	public String pen(String name) {
		return "bhuvi";
	}
	
	public String pen(String name, int name1) {
		return name+name1;
	}
	
	public int pen(int price,int price2,int price3) {
		return price+price2+price3;
	}
	
	
	
	
	public static void main(String[] args) {
		Loading l=new Loading();
		System.out.println(l.pen(5)+"  "+l.pen(4)+" "+l.pen(null)+" "+l.pen("bhuviii", 5));
		System.out.println(l.pen(0, 0, 0));
	}

}
