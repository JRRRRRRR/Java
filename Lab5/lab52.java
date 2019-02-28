import java.util.Scanner;
import java.lang.*;
public class lab52{
	public static void main(String[] args) {
		int sides;
		double length, area;
		System.out.println("Enter the number of sides : ");
		Scanner inputSides = new Scanner(System.in);
		sides = inputSides.nextInt();
		System.out.println("Enter the side :");
		Scanner inputLength = new Scanner(System.in);
		length = inputLength.nextDouble();
		area = sides * length * length /(4 * Math.tan((Math.PI)/sides));
		System.out.println("The area of the polygon is " + area);
	}
}