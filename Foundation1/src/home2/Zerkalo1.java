package home2;
import java.util.Scanner;
import java.util.Arrays;

public class Zerkalo1 {
   @SuppressWarnings("unused")
public static void main (String []args) {
            
      Scanner sc = new Scanner (System.in);
      
      System.out.println ("Enter number of arrays: ");
      // ввод длины массива
      int n = sc.nextInt();
      long[] a = new long [n];
      
      
      System.out.println ("Enter your arrays: ");
      // ввод элементов массива
      for (long i = 0; i< n; i++) {
        long a1 = sc.nextLong();
      }
      
      // вывод длины
      System.out.println ("n = " + n);
      
      // вывод массива
      String s = Arrays.toString (a);
      System.out.println ("Array a is " + s);
      
      System.out.println ();
      
       System.out.println ("Enter your index of arrays: ");
      // ввод индекса элемента массива
       int t = sc.nextInt();
      
      // вывод нужного элемента на консоль по индексу
      for (int j = 0; j<n; j++) {
         if (j == t) {
            a [j] = a [t];
          System.out.println ("Element is " + a[j]);
          break;
           }      
       }
      
      sc.close ();   
   }
}
