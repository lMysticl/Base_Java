/*�������: 
�������: 
 ������� ����� Phone � ������:
 - static Phone[] phones = new Phone[10];
 - String myNumber
 - String marka
 ���������� phones �� �������� ���������, ��� �������� ����������� ����� �����������.
 ��� �������� ������ �������-��������, �� ������ ������� ��� ����� � �� �������� � ���� ������� phones. 
 � ���� ����� �������� �����: 
 - isNumberExist(String number) - ��������� ������� �������� � ����
 - call(String number) - ������� �� ����� "������� �����-��(�����+�����) ������ ������-��(�����+�����)"
 - getRandomPhone() - ���������� ��������� ������� �� ���� ���������
 ����������� � 10 ���������.
 � MainPhone: 
 - ������� ��������� ��������� � ������-�� ��������
 - ����������� ��������� ������� ������������� � ��������������� ������.
 - ��� ���������� �������� ������� ����� call � ����� ������ �� ��������� �������.*/
package week2.lesson4;


public class Phone { 
static Phone[] phones = new Phone[10]; 
String myNumber; 
String mark; 
static boolean isnumber = false; 

public Phone() { 
this(null, null); 
} 

public Phone(String myNumber) { 
this(myNumber, null); 
} 

public Phone(String myNumber, String mark) { 
this.myNumber = myNumber; 
this.mark = mark; 
} 

// public void mark(String mark) { 
// } 

public String getMyNumber(String myNumber) { 
return myNumber; 
} 
public void myNumber(String myNumber) { 
this.myNumber = myNumber; 
} 

public void setmark(String mark) { 
this.mark = mark; 
} 

public void isNumberExist(String myNumber) { 
for (int i = 0; i < phones.length; i++) { 
if (phones[i] != null && myNumber.equals(phones[i].getMyNumber())) { 

System.out.println("NymberExist"); 
} else { 
System.out.println("Don't NymberExist"); 
} 
} 
} 

public void call(String phone) { 
for (int i = 0; i < phones.length; i++) { 
if (phones[i] != null) { 
System.out.println("������: "+phones[i]); 
} 
} 
} 
public static void printAllNumbers() { 
for (int i = 0; i < phones.length; i++) { 
System.out.println(phones[i]); 

} 
} 

public static Phone getRandomPhone() { 
return phones[((int) (Math.random()*10))]; 
} 

public Phone getMyNumber() { 

return phones[((int) (Math.random()*10))]; 
} 

public void call(Phone myNumber2) { 

System.out.println("������ �� �����"+getMyNumber()); 
} 
}