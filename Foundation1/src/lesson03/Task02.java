package lesson03;

import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
		int comp = (int) (Math.random() * 10) + 1;// Загадали число
		Scanner scan = new Scanner(System.in);
		int choise = 0;
		int c = 0;
		do {
			System.out.println("Угадайте число (Ваш выбор :");
			while (!scan.hasNextInt()) { // Пока не число , ошибка
				System.out.println("\nОшибка вы ввели не число :" + scan.next() + "не число");
				System.out.println("\nУгадай число(Ваш выш):");
			}

			choise = scan.nextInt();

			if (choise < comp) {
				System.out.println("Ведите число больше");
			} else if (choise > comp) {
				System.out.println("Ведите число меньше");
			}
			c++;
		} while (choise != comp);
		System.out.println("Угадал с = " + c + " Попытки");
		scan.close();
	}

}
