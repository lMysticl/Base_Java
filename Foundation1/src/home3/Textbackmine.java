package home3;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
public class Textbackmine {
	public static void main(String[] args) throws IOException {
		ArrayList<String> list = new ArrayList<>();
		list.add("Fuck off");
		FileWriter writer = new FileWriter("text1.txt");
		for (String str : list) {
			writer.write(str + "\n");
		}
		writer.flush();
		writer.close();
	}

	@SuppressWarnings("unused")
	public static void ChangeL() throws IOException {
		Formatter x;
		try {
			ArrayList<String> file = new ArrayList<>();

			FileReader reader = new FileReader("text1.txt");

			Scanner scan = new Scanner(reader);
			String date = scan.nextLine();
			String riverDate = "";
			for (int i = 0; i < date.length(); i++) {
				riverDate += date.substring(date.length() - 1 - i, date.length() - i);
			}
			System.out.println(riverDate);
			reader.close();
			try {
				x = new Formatter("text1.txt");
				x.format(riverDate);
				x.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			reader.close();
			scan.close();}
		catch (FileNotFoundException e) {
			System.err.println("File not fount" + e.getMessage());
			// throw new ArithmeticException();
		}
	}}