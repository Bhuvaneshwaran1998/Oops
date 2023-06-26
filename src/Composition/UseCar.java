package Composition;

public class UseCar {

	public static void main(String[] args) {
		Engine e=new Engine();
		e.brand="Bmm";
		e.price=20000;
		e.sNo="s-123";
		
		Car c=new Car();
		c.brand="BMW";
		c.price=700000;
		c.isPetrol=false;
		c.engine=e;
		
		System.out.println(c.brand+"  "+c.engine.brand);
		

	}

}
