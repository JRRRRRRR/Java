import java.util.Scanner;
public class Lab32{
	public static void main(String[] args) {
		double weight,cost;
		cost = 0;
		System.out.println("Enter the value of weight: ");
		Scanner valueOfweight = new Scanner(System.in);
		weight = valueOfweight.nextDouble();
		if (weight > 0 && weight <= 1){
			cost = 3.5;
		}else if (weight > 1 && weight <= 3){
			cost = 5.5;
		}else if (weight > 3 && weight <= 10){
			cost = 8.5;
		}else if (weight > 10 && weight <= 20){
			cost = 10.5;
		}
		if (weight <= 0){
			System.out.println("Invalid imput.");
		}else if (weight > 20){
			System.out.println("The package cannot be shipped.");
		}else {System.out.println("The cost of this package is: " + cost);
	}
}
}