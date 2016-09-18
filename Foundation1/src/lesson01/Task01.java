package lesson01;

	public class Task01 {
			public static void main(String[] args){			
				//byte b = 5,c,d = 10;
				//byte a = (byte) 128; //Значение Null
				byte a = 100;
				short b = a;
				b = 1200; a = (byte) b;
				double pi = 3.14;
				float f = 2.25f;	
				int g = (int) pi;
				System.out.println(pi + "G = " + g+"\nf = "+f);
				char chA = (char) 65, chB = 66;
				boolean foo = chA == chB; //false
				boolean foo2 = chA != chB; //false
				boolean foo3 = chA > chB,foo4 =chA >= chB;// <,<=
				System.out.println(foo + "\nfoo2 = "+foo2);
				System.out.println(foo3 +" "+foo4);
			}}
