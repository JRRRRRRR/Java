import java.util.Scanner;
public class lab51{
public static void main(String[] args) {
	int num, result=1;
	System.out.println("Enter a positive integer: ");
	Scanner input = new Scanner(System.in);
	num = input.nextInt();
	while(num > 0){
		result *= num;
		num--;
	}
	System.out.println("Factorial is : " + result); 
}

}