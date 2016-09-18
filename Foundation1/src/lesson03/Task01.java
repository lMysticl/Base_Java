package lesson03;

public class Task01 {

	public static void main(String[] args) {

		int a = 5;
		System.out.println("Begin DO/WHILE");
		do {
			System.out.println("a = " + a++);
		} while (a < 5);
		System.out.println("End DO/WHILE");

		System.out.println("Begin WHILE");
		while (a > 3) {
			System.out.println("Operation WHILE" + a--);
		}
		System.out.println("End WHILE");
	}
}
