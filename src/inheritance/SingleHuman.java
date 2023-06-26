package inheritance;

public class SingleHuman {
	
	private String name;
	private int age;
	private String qulification;
	private int dOB;
	
	public SingleHuman(String name, int age, String qulification, int dOB) {
		super();
		this.name = name;
		this.age = age;
		this.qulification = qulification;
		this.dOB = dOB;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getQulification() {
		return qulification;
	}

	public void setQulification(String qulification) {
		this.qulification = qulification;
	}

	public int getdOB() {
		return dOB;
	}

	public void setdOB(int dOB) {
		this.dOB = dOB;
	}

	@Override
	public String toString() {
		return "SingleHuman [name=" + name + ", age=" + age + ", qulification=" + qulification + ", dOB=" + dOB + "]";
	}
	

}
