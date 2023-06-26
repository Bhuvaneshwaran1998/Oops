package Abstraction;

public class C extends B  {

	@Override
	public String dob(String dob) {
		
		return "14/10/98";
	}

	@Override
	public String quli(String quli) {
		
		return "B.E-EcE";
	}
	
	public static void main (String[] args) {
		C c=new C();
		System.out.println(c.name(null)+" "+c.age(25)+" "+c.dob("17/10/98")+" "+c.quli("B.E-Mech"));
	}



}
