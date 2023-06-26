package encapsulation;

public class GetterSetterUse {

	public static void main(String[] args) {
		GetterSetterMethod g=new GetterSetterMethod();
	g.setBrand("bmw");
	g.setPrice(500000);
	g.setColour("block");
	g.setPetrol(true);
	GetterSetterMethod g2=new GetterSetterMethod();
	g2.setBrand("suziki");
	g2.setPrice(400000);
	g2.setColour("blue");
	g2.setPetrol(false);
	System.out.println(g.getBrand()+"  "+g.getColour()+"  "+g2.getBrand()+"  "+g2.getColour());

	}

}
