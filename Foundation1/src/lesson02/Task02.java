package lesson02;

import java.util.Random;

public class Task02 {
	public static void main(String[] args) {
		Random rm = new Random();
		int a = (int)(Math.random() * 10);//(0,10
		System.out.println(a);
		int b = rm.nextInt(10);//(0,10)
		System.out.println(b);
		
		int c = 10 + (int) (Math.random() *(20 -10)); //(10-20)
		System.out.println(c);
		
		int d = -10 + (int) (Math.random()*(30 - (10 * (-1)))+1);
		System.out.println(d);
	}
}
