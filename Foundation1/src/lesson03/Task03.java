package lesson03;

public class Task03 {

	public static void main(String[] args) {
		// int array[] = new int[10];
		//int[] array2 = new int[10];//-второй вариант обявление
		int[] numbers = { 1, 2, 5, 8 };
		 System.out.println(numbers[3]+" Количество элементов:"+numbers.length);
		int array[] = new int[10];
		for (int count = 0; count < 10; count++) {
			array[count] = (int) (Math.random() * 10);
		}
		int num = 0;
		for (int i = 0; i < array.length; i++) {
			num = num + array[i];
			/*
			 * for(int i = 0; i== array.length; i++){ num = num + array[i];
			 * System.out.print(array[i]+" ");
			 */
			/*
			 * for(int i=0;;){ if(i<array.length{ braek; }
			 */
			/*
			 * int i=0 for(;;){ if(i<array.length{ braek; }
			 */

			System.out.print(array[i] + " ");
		}

		System.out.println("Cумма массива= " + num);
	}
}
