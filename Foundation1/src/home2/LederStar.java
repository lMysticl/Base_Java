package home2;

import java.util.Scanner;

public class LederStar {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int height = scanner.nextInt();
		drawStair(height);
	}

	public static void drawStair(int height) {

		if (height <= 0) {
			System.out.println("Неверное значение высоты");

		}

		for (int i = height - 1; i >= 0; i--) {
			
			for (int j = i; j < height; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
}
//100
//Задание выполнено
//Код решения: 8oqnB0PETY95RZy6bOU2Lc/qq/M=