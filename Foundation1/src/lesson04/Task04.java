package lesson04;

public class Task04{
	 public static void main(String[] args) {
	  int[] array = randomArray(10);
	  printArray(array);
	  printArray(array, 1, 5);
	  System.out.println(sumUnCountable(array));
	  System.out.println(setElement(5, 100, array));
	  int[] array1 = { 1, 2, 3, 4, 4, 3, 2, 1 };
	  printArray(array1);
	 }
	 
	 public static int[] randomArray(int size) {
	  int[] array = new int[size];
	  for (int i = 0; i < array.length; i++) {
	   array[i] = (int) (Math.random() * 10);
	  }
	  return array;
	 }
	 
	 public static int sumUnCountable(int[] array) {
	  int sum = 0;
	  for (int i = 0; i < array.length; i++) {
	   if (array[i] % 2 == 0) {
	    sum += array[i];
	   }
	  }
	  return sum;
	 }
	 
	 public static int setElement(int idx, int element, int[] array) {
	  int old = array[idx];
	  array[idx] = element;
	  return old;
	 }
	 
	 public static void printArray(int[] array) {
	  for (int i = 0; i < array.length; i++) {
	   if (i == 0) {
	    System.out.print("[" + array[i] + ", ");
	   } else if (i > 0 & i < array.length - 1) {
	    System.out.print(array[i] + ", ");
	   } else {
	    System.out.println(array[i] + "]");
	   }
	  }
	 }
	 
	 
	 public static void printArray(int[] array, int idxBegin, int idxEnd) {
	  for (int i = idxBegin; i <= idxEnd; i++) {
	   if (i == idxBegin) {
	    System.out.print("[" + array[i] + ", ");
	   } else if (i > 0 & i < idxEnd) {
	    System.out.print(array[i] + ", ");
	   } else {
	    System.out.println(array[i] + "]");
	   }
	  }
	 }
	}