package inheritance;

public class HieraricalC extends HieraricalA{
	public boolean isPetrol(boolean isPetrol) {
		return false;
	}

	public static void main (String[] args) {
		HieraricalB b=new HieraricalB();
		HieraricalC c=new HieraricalC();
		
		System.out.println(b.brand("suziki")+" "+b.colour("white")+" "+b.price(500000));
		
		System.out.println(c.brand("maruthi")+"  "+c.colour("yellow")+" "+c.isPetrol(false));
	}
}
