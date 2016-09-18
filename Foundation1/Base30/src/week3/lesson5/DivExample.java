package week3.lesson5;

public class DivExample {
	private final int p ;//инициализация
	public DivExample(){
		System.out.println("DivExample");
		p = 20;
	}
	//блок инициализации
	{
		System.out.println("block initial");
		//p = 20;
		}
	//статический блок инициализации (вызивается первым)
	static{
		System.out.println("static block initial");
	}
}
		
