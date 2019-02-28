public class lab62{
	public static void main(String[] args) {
		int rand = (int)(Math.random() * 26 + 65);
		char letter = (char) rand;
		System.out.println("The random uppercase is " + letter);
	}
}