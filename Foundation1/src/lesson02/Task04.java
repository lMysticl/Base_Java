package lesson02;

import java.util.Scanner;

public class Task04 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Видите A: ");
		int a = scan.nextInt();
		System.out.print("Видите В: ");
		int b = scan.nextInt();
		
		if (b != 0) {
			System.out.println(a/b);
		} else {
			System.out.println("Error! Division by zero!");
		}
			
		/*Scanner scan2 = new Scanner(System.in);
		String srt = scan2.nextLine();
		System.out.println(srt);*/
		scan.close();	
	}}
