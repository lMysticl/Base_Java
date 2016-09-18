package home;

import java.util.Scanner;

public class Biger_smaller {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int firstVar = scan.nextInt();
		int secnVar = scan.nextInt();
		int therVar = scan.nextInt();
		int maxN = 0, minN = 0;
		if (firstVar > secnVar && firstVar > therVar) {
			maxN = firstVar;
		} else if (secnVar >= firstVar && secnVar >= therVar) {
			maxN = secnVar;
		} else if (therVar > secnVar && therVar > firstVar) {
			maxN = therVar;
		} else if (therVar == secnVar || therVar == firstVar) {
			if (therVar > secnVar) {
				maxN = therVar;
			} else {
				maxN = firstVar;
			}
		}
		System.out.print("" + maxN);

		if (firstVar < secnVar && firstVar < therVar) {
			minN = firstVar;
		} else if (secnVar < firstVar && secnVar < therVar) {
			minN = secnVar;
		} else if (therVar < secnVar && therVar < firstVar) {
			minN = therVar;
		} else if (therVar == secnVar || therVar == firstVar) {
			if (therVar < secnVar) {
				minN = therVar;
			} else {
				minN = firstVar;
			}
		} else {
			minN = secnVar;
		}
		System.out.print(" " + minN);
		scan.close();

	}
}
// 100
// Задание выполнено
// Код решения: XImAzA136ZxsQbXr2klNwcbIZ0s=
