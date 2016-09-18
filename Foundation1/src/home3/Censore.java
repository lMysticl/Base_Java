package home3;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Censore {
	public static void main(String[] args) {
		
		Censore ceFile = new Censore();
		ceFile.censoredWorldsFile();

	}
		
		public void censoredWorldsFile() {
			FileWriter fileWriter = null;
			BufferedReader bufferedReader = new BufferedReader(
					new InputStreamReader(System.in));
			try {
				System.out.print("¬ведите им€ файла: ");
				String fileName = bufferedReader.readLine();
				File file = new File(fileName);
				File fileCensored = new File("censoredWorlds");
				String[] arrSplit = null;
				if (file.isFile() && file.exists()) {
					BufferedReader bufferedReaderText = new BufferedReader(
							new FileReader(file));
					String strText = bufferedReaderText.readLine();
					arrSplit = strText.split("[ .,:;]");
					String strCensored = censored(fileCensored);
					String[] arrCensored = strCensored.split(", ");
					for (int i = 0; i < arrCensored.length; i++) {
						for (int j = 0; j < arrSplit.length; j++) {
							if (arrCensored[i].equalsIgnoreCase(arrSplit[j])) {
								arrSplit[j] = "[вырезано цензурой]";
							}
						}
					}
					bufferedReaderText.close();
				}
				fileWriter = new FileWriter("text2", false);
				for (int i = 0; i < arrSplit.length; i++) {
					String str = arrSplit[i] + " ";
					fileWriter.write(str);
				}
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	 
		public String censored(File file) {
			StringBuilder stringBuilder = new StringBuilder();
			try {
				BufferedReader bufferedReader = new BufferedReader(new FileReader(
						file));
				String str = null;
				while ((str = bufferedReader.readLine()) != null) {
					stringBuilder.append(str);
					if (bufferedReader.ready()) {
						stringBuilder.append("\n");
					}
				}
				bufferedReader.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return stringBuilder.toString();
		}
	 
	}

