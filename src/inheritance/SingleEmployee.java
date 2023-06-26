package inheritance;

public class SingleEmployee extends SingleHuman {
	
	private String roll;
	private int salary;
	
	public SingleEmployee(String name, int age, String qulification, int dOB, String roll, int salary) {
		super(name, age, qulification, dOB);
		this.roll = roll;
		this.salary = salary;
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		
		return super.toString()+ "[roll=" + roll + ", salary=" + salary + "]";
	}

	
	
	
	
	

}
