package fundamentos.operadores;

public class ExerciseArithm {
	public static void main(String[] args) {
		//math.pow(number, power) = power

		double numA = Math.pow (6 * (3 + 2), 2);
		System.out.println(numA);
		double denA = 3*2;
		double x = numA / denA; 
		System.out.println(x);
		
		double y = Math.pow((1-5)*(2-7) / 2, 2);
		System.out.println(y);
		
		double xy = Math.pow((x - y), 3);
		System.out.println(xy);
		
		double denZ = Math.pow(10, 3);
		System.out.println(denZ);
		
		double z = xy / denZ;
		System.out.println(z);
		
		
		
		
		
	}
}
