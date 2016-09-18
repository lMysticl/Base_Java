package lesson05;

import java.util.Arrays;

public class Task04 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String str = "Hello World";
		String str2 = "Hello World";
		// Сравнение по ссылке на объект
		System.out.println(str == str2);
		String str3 = new String("Hello World");
		System.out.println(str == str3);
		// Сравнение по содержанию строки
		System.out.println(str.equals(str3));
		str2 = "Hi";
		System.out.println(str == str2);
		str = null;
		// Конкатинация
		String foo1 = "Sum:" + 4 + 6;
		String foo2 = "Sum" + (4 + 6) + " Mod: " + (6 % 3);
		String foo3 = new String();
		String foo4 = " ";
		foo4.concat(foo1).concat(foo2).concat(foo4);
		System.out.println(foo1 + " " + foo2);
		String foo5 = "Frist String";
		System.out.println(foo5);
		// Создание подстановки из существующей строки
		String foo6 = foo5.substring(4);
		System.out.println(foo6);
		String foo7 = foo5.substring(4, 8);
		System.out.println(foo7);
		// Созднание строки из масива char
		char[] ch = { 'H', 'e', 'l', 'l', 'o' };
		String chStr = new String(ch);
		System.out.println(chStr);
		char[] chr = chStr.toCharArray();
		System.out.println(Arrays.toString(chr));
		System.out.println(chStr.charAt(0) + "" + chStr.charAt(2) + ""
				+ chStr.charAt(4));
		chStr = "Hello World";
		System.out.println(chStr.contains("Hell"));
		System.out.println(chStr.contains("Holl"));
		String[] strArray = chStr.split(" ");
		System.out.println(Arrays.toString(strArray));
	}
}
