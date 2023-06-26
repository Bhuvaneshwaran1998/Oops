package Abstraction;

public abstract class B implements A {

	@Override
	public String name(String name) {
		
		return "sharmila";
	}

	@Override
	public int age(int age) {
		
		return 24;
	}
	
   abstract public String dob(String dob);
   
   abstract public String quli(String quli);

}
