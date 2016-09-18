package lesson04;

public class Task03 {

	public static void main(String[] args) {
		double num1 = 6;
		double num2 = 7;
		double d = Task03.pow(num1, num2);
		System.out.println("Число " + num1 + " в степени " + num2 + " равно "
				+ d);
		System.out.println();

	}

	public static double pow(double number, double pow) {
		double result = 1;
		for (int i = 0; i < pow; i++) {
			result = result * number;
		}
		return result;
	}
}