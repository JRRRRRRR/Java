public class lab61{
	public static void main(String[] args) {
		int sum = 0;
		double average;
		for (int i = 0; i < 10; i++){
			int random = (int)(Math.random()*100);
			sum += random;
		}
		average = sum / 10.0;
		System.out.println("The average is " + average);
	}
}