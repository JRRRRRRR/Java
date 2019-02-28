import java.util.Scanner;
public class Lab31{
	public static void main(String[] args) {
		double a, b, c, discriminant, r1, r2;
		r1 = 0;
		System.out.println("Enter the value of a: ");
		Scanner valueOfa = new Scanner(System.in);
		a = valueOfa.nextDouble();
		System.out.println("Enter the value of b: ");
		Scanner valueOfb = new Scanner(System.in);
		b = valueOfb.nextDouble();
		System.out.println("Enter the value of c: ");
		Scanner valueOfc = new Scanner(System.in);
		c = valueOfc.nextDouble();
		discriminant = b * b - (4 * a * c);
		if (discriminant > 0){
			r1 = ( -b + Math.pow(discriminant,0.5) )/ (2 * a);
			r2 = ( -b - Math.pow(discriminant,0.5) )/ (2 * a);
			System.out.println("The equation has two roots: " + r1 + "and " + r2);
		}else if (discriminant == 0){
			r1 = ( -b + Math.pow(discriminant,0.5) )/ (2 * a);
			System.out.println("The equation has one root: " + r1);
		}else if (discriminant < 0){
			System.out.println("The equation has no real roots.");
		}

	}
}