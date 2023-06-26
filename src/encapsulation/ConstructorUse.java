package encapsulation;

public class ConstructorUse {

	public static void main(String[] args) {
		ConstructorMethod c1=new ConstructorMethod("soni",25000,"green",false);
		ConstructorMethod c2=new ConstructorMethod("croma",20000,"white",true);
	
		System.out.println(c1.brand+"  "+c1.price+"  " +c2.brand+"  "+c2.price);
        
	}

}
