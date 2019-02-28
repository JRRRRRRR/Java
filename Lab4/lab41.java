import java.util.Scanner;
public class lab41{
	public static void main(String[] args) {
		int y, z, i, f, g;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive three digit integer: ");
		int x = input.nextInt();
		y = x % 100;
		z = y % 10 ;
		i = x / 100;
		f = y / 10;
		g = z * 100 + f * 10 + i;
		if (g == x){
			System.out.println(x + " is a palindrome.");
		}
		else{
			System.out.println(x + " is not a palindrome.");
		}
	}
}
