package classe;

public class AreaCircTeste {
	public static void main(String[] args) {
		
		AreaCirc a = new AreaCirc(8);
		System.out.println(a.area());
		
		
		AreaCirc a1 = new AreaCirc(5);
		System.out.println(a1.area());
	
		System.out.println(AreaCirc.PI);
		System.out.println(AreaCirc.area(90));
	}
}
