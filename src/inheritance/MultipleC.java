package inheritance;

public class MultipleC implements MultipleA,MultipleB {

	@Override
	public String dob(String dob) {
		
		return "17/10/98";
	}

	@Override
	public String name(String name) {
		
		return "bhuvanesh";
	}

	@Override
	public int age(int age) {
		
		return 24;
	}
	
	
	
	
	public static void main (String[] args) {
		
		MultipleC m=new MultipleC();
		
		System.out.println(m.dob("17/10/99")+" "+m.age(2)+" "+m.name("bhuvanesh"));
	}
	

}
