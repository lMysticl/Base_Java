package home2;
import java.util.Scanner;
import java.util.Arrays;

public class Zerkalo1 {
   @SuppressWarnings("unused")
public static void main (String []args) {
            
      Scanner sc = new Scanner (System.in);
      
      System.out.println ("Enter number of arrays: ");
      // ���� ����� �������
      int n = sc.nextInt();
      long[] a = new long [n];
      
      
      System.out.println ("Enter your arrays: ");
      // ���� ��������� �������
      for (long i = 0; i< n; i++) {
        long a1 = sc.nextLong();
      }
      
      // ����� �����
      System.out.println ("n = " + n);
      
      // ����� �������
      String s = Arrays.toString (a);
      System.out.println ("Array a is " + s);
      
      System.out.println ();
      
       System.out.println ("Enter your index of arrays: ");
      // ���� ������� �������� �������
       int t = sc.nextInt();
      
      // ����� ������� �������� �� ������� �� �������
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
