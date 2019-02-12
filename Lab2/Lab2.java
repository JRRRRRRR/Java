import java.util.Scanner;
public class Lab2{
	public static void main(String[] args) {
		double v0, v1, t, a;
		System.out.println("Enter the starting velovity v0 in meters/second: ");
		Scanner startingVelovity = new Scanner(System.in);
		v0 = startingVelovity.nextDouble();
		System.out.println("Enter the ending velovity v1 in meters/second: ");
		Scanner endingVelovity = new Scanner(System.in);
		v1 = endingVelovity.nextDouble();
		System.out.println("Enter the time span t in seconds: ");
		Scanner time = new Scanner(System.in);
		t = time.nextDouble();
		a = (v1-v0)/t;
		System.out.println("The average acceleration will be " + a);
		
	}
}