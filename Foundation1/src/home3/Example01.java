package home3;

public class Example01 {

		public static void main(String args[])
		throws java.io.IOException {
		char ch, ignore, answer = 'S';
		do {
		System.out.println("�a�y�a�a ����� �� ��������� A-Z.");
		System.out.print("�o���a��ec� �� �������: ");
		// �������� ������ � ����������
		ch = (char) System.in.read();
		// ��������� ��� ��������� ������� �� ������� ������
		do {
		ignore = (char) System.in.read();
	} while(ignore != '\n');
		
		if(ch == answer) System.out.println("** ���������! **");
		else {
		System.out.print(" ... �������e, ������ ����� ��������� ");
		if(ch < answer)
		System.out.println("����e � ����� ��������");
		else System.out.println("����e � ������ ��������");
		System.out.println("�o��op��e �������!\n");
		}}
		while(answer != ch);
		}}		