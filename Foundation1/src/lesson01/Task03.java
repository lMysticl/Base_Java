package lesson01;

import java.util.Scanner;

public class Task03 {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
			System.out.println("Enter value A: ");
			
			int a = scan.nextInt();
			System.out.println("Enter value B: ");
			
			int b = scan.nextInt();
			int c = a + b;
			System.out.println("c= " +c); 
			System.out.println("SUM = " + (a + b)); //54
			System.out.println("Число A:"+a+" \n"+"Число B:"+b);
			scan.close();
	}
}
