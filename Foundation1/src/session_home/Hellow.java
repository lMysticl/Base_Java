package session_home;

import java.util.Scanner;

public class Hellow {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner scana = new Scanner(System.in);
		double numAdd = scana.nextDouble();
		double a = scana.nextDouble();
		// double b = scana.nextDouble();
		double facN = 0;

		int i;
		// for (i=0;i<numAdd-1;i++){
		facN = (a - 1) * a;

		// }

		System.out.println(facN);
		scana.close();
	}
}
