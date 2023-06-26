package encapsulation;

public class ToStringUse {

	public static void main(String[] args) {
		ToStringMethod	t=new ToStringMethod();
		t.brand="silmfit";
		t.colour="green";
		t.price=500;
		t.isLycra=true;
		
		ToStringMethod t1=new ToStringMethod();
		t1.brand="corton";
		t1.colour="block";
		t1.price=700;
		t1.isLycra=false;
		
		System.out.println(t);

	}

}
