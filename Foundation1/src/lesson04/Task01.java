package lesson04;

public class Task01 // Метод перегрузки
{

	public static void main(String[] args) {
		int sum = Task01.sum(2, 2) + sum(3, 3);
		// int sum = 0; В одном классе можно записать и так
		System.out.println(sum);
		System.out.println(sum(3, 3.2));// 6.2
		System.out.println(sum(3, 4, 5));// 12
	}

	public static int sum(int first, int second) {
		// int result = first + second;
		// return result;
		return first + second;

	}

	public static double sum(double first, double second) {
		return first + second;
	}

	public static int sum(int first, int second, int... args) {
		int result = first + second;
		for (int i = 0; i < args.length; i++) {
			result += args[i];
		}
		return result;
	}
}
/*
 * class Exmple{ public static void foo(){ double sum = Task01.sum(1,1); } }
 * class Exmple { public static void foo(){ double sum = Task01.sum(1,1); } }
 */