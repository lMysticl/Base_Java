package lesson02;

public class Task01 {
	public static void main(String[] args){
	
		//������������ �����������
		int a = 5, b = 10;
		System.out.println(Math.min(a,b));
		System.out.println(Math.max(a, b));
		
		//���������� �� �������� �������
		double c = Math.PI, d=4.8;
		System.out.println(Math.round(c)); //3
		System.out.println(Math.round(d)); //5
		
		//���������� � ������� �������
		System.out.println(Math.ceil(c)); //4
		
		//���������� � ������� ������� 
		System.out.println(Math.floor(d)); //4.0
		//���������� � �������
		System.out.println(Math.pow(2,3)); //8.0
		//������
		System.out.println(Math.sqrt(8)); //2.8...
		System.out.println(Math.round(Math.sqrt(8))); //3
		System.out.println(Math.cbrt(27)); //3.0
	}

}
