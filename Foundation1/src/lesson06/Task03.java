package lesson06;

import java.io.*;
import java.util.*;

public class Task03 {
	public static void main(String[] args) throws IOException {
		try {
			ArrayList<String> file = new ArrayList<>();

			FileReader reader = new FileReader("text.txt");
			Scanner scan = new Scanner(reader);

			while (scan.hasNextLine()) {
				file.add(scan.nextLine());
			}

			file.remove(1);
			file.remove(2);
			file.add("New information!!!");
			file.add("New information!!!");
			file.add(0,"New information!!!");
		
			FileWriter writer = new FileWriter("text.txt");
			for (String string : file) {
				writer.write(string + "\n");
			}
			writer.flush();

			writer.close();
			reader.close();
			scan.close();
		} catch (FileNotFoundException e) {
			System.err.println("File not fount" + e.getMessage());
			// throw new ArithmeticException();
		}
	}
}