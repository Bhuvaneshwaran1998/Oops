package encapsulation;

public class FullEncapsulationUse {

	public static void main(String[] args) {
		
		FullEncapsulation f=new FullEncapsulation("rolex",3000,"silver",true);
		FullEncapsulation f2=new FullEncapsulation("egil",2000,"blue",false);
		FullEncapsulation f3=new FullEncapsulation("apple",50000,"silver",true);
		
		System.out.println(f+" "+f2);

	}

}
