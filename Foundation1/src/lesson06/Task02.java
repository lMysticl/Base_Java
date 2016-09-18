package lesson06;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Task02 {

	public static void main(String[] args) throws IOException {
		ArrayList<String> list = new ArrayList<>();
		list.add("First string");
		list.add("Second string");
		list.add("Third string");
		FileWriter writer = new FileWriter("text.txt");
		for (String str : list) {
			writer.write(str + "\n");
		}
		writer.flush();
		writer.close();
	}

}
