package lesson03;

public class Task03_teh {
	public static void main(String[] args) {
		int array[] = new int[10];
		for (int count = 0; count < 10; count++) {
			array[count] = (int) (Math.random() * 10);
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println("--------------------");

		for (int i = 0; i < array.length;) {
			System.out.print(array[i++] + " ");
		}

		System.out.println("--------------------");

		for (int i = 0;;) {
			if (i == array.length) {
				break;
			}
			System.out.print(array[i++] + " ");
		}

		System.out.println("--------------------");
		int i = 0;
		for (;;) {
			if (i < array.length) {
				break;
			}
			System.out.print(array[i++] + " ");
		}
		// for (;;);
	}
}
