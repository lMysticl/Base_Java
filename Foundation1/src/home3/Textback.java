package home3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Textback {
	public static void main(String[] args) {
		Scanner scan = null;
		Formatter x;//переводит строку в двоичный код
		try {
			scan = new Scanner(new File("text.txt"));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String date = scan.nextLine();
		String riverDate = "";
		
		for (int i = 0; i < date.length(); i++) {
			riverDate += date.substring(date.length() - 1 - i, date.length() - i);
			
		}
		System.out.println(riverDate);

		try {
			x = new Formatter("text.txt");
			x.format(riverDate);
			x.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
