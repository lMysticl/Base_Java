package home2;
import java.util.Arrays;
import java.util.Scanner;
public class Massivklav {


	private static Scanner a;

	public static void main(String[] args) {
		a = new Scanner(System.in);
		System.out.println("������� ����� �������: ");
		int n=a.nextInt();
		int b[]=new int[n];
		System.out.println("������ ����� ��� ���������:");
		int i=0;
		while ( i<b.length){
			b[i]=a.nextInt();
			i++;}
            System.out.println("��� ��� ������");
			System.out.println(Arrays.toString(b));
		
	}

}
