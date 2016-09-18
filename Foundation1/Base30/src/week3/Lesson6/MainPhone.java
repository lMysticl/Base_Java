/*�������� ����� ���������.
 - abstract class Phone(String number, boolean camera, int sideSize)
 - class Nokia
 - class Samsung
 - abstract class IPhone{int appleId}
 - class IPhone4
 - class IPhone5
 ��� ����� ������:
  - call(Phone ph) - ������� �����-�� ����� � � �����-�� ������� ������ ������-�� ������� ����� � ������
  - printModel()
  - printAppleId()// ��� �������
������� ����� MainPhone, � ������� ������� ������ ���������.
�������� ���� ��������� � �������� ������� ���� � ������.(Nokia, Samsung, IPhone4, IPhone5)
� ������� ������� 2 (�������)������ �������� � ������� ������ call  � ������ ����� �� ������.
��� ���� ��������� �� ������ ������� ����� printModel.
����� ��� ���� ���������, ��� ������� �������� ������� ����� printAppleId.*/
package week3.Lesson6;
import java.util.ArrayList;
import java.util.Scanner;

public class MainPhone {
	  public static ArrayList<Phone> phones = new ArrayList<>();
	public static void main(String[] args) {
		Phone Nokia = new Nokia("2",true,3);
		Phone Samsung = new Samsung("1",true,4);
		
		
		phones.add(new Nokia(" 35 ", false, 0));
		phones.add(new Nokia(" 36", false, 0));
		phones.add(new IPhone4("37", false, 0,0));
		phones.add(new IPhone5("38", false, 0,0));
		phones.add(new IPhone5("39", false, 0,0));
		phones.add(new IPhone5("40", false, 0,0));
		int k1= (int)(6*Math.random());
		int k2= (int)(6*Math.random());
		phones.get(k1).call(phones.get(k2));
		
		
		
	}
}
