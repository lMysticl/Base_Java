package lesson05;
import java.util.Arrays;
public class Task01 {
 public static void main(String[] args) {
  int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
  swapHalves(array);
 }
 
 public static void swapHalves( int[] array)
 {
	 if(array.length<=0) {System.out.println("Неверный размер вектора");}
	 else{
	 if (array.length % 2 == 0) {
   for (int i = 0, j = array.length / 2; 
        j < array.length; i++, j++) {
    //swap(array[i], array[j]);
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
   }
   System.out.println(Arrays.toString(array));}
  else if ( array.length % 2 != 0)  {
   for (int i = 0, j = ( (array.length) / 2+1) ; 
     j < array.length; i++, j++) {
    //swap(array[i], array[j]);
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
   }
   System.out.println(Arrays.toString(array));}
//
//  else if ( array.length % 2 != 0)  {
//	   for (int i = 0, j = ( array.length / 2 ) - 1; 
//	     j < array.length; i++, j++) {
//	    //swap(array[i], array[j]);
//	    int temp = array[i];
//	    array[i] = array[j];
//	    array[j] = temp;
//	   }
//  }
  else{System.out.println("Неверный размер вектора");}}}
 
 
 public static void swap(Integer first, Integer second) {
  int temp = first;
  second = first;
  first = temp;
 }
}

//100
//Задание выполнено
//Код решения: /6AuTte9STB7BXVpWDXKHMvIui4=