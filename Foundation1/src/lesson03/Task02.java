package lesson03;

import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
		int comp = (int) (Math.random() * 10) + 1;// �������� �����
		Scanner scan = new Scanner(System.in);
		int choise = 0;
		int c = 0;
		do {
			System.out.println("�������� ����� (��� ����� :");
			while (!scan.hasNextInt()) { // ���� �� ����� , ������
				System.out.println("\n������ �� ����� �� ����� :" + scan.next() + "�� �����");
				System.out.println("\n������ �����(��� ���):");
			}

			choise = scan.nextInt();

			if (choise < comp) {
				System.out.println("������ ����� ������");
			} else if (choise > comp) {
				System.out.println("������ ����� ������");
			}
			c++;
		} while (choise != comp);
		System.out.println("������ � = " + c + " �������");
		scan.close();
	}

}
