package home3;
import java.util.Arrays;
import java.io.IOException;
//import java.util.ArrayList;
public class Textmineback {
 @SuppressWarnings("unused")
public static void main(String[] args) throws IOException {
	 String list = "йцукен";
//		list.add("йцукен");
//		FileWriter writer = new FileWriter("text2.txt");
//		writer.write(list);
//		Path testFilePath = Paths.get("text2.txt");
//		
	 String myString = "xyz";
	 char [] myCharArray = myString.toCharArray ();

	 char [] list1 = list.toCharArray ();
//	 writer.flush();
//		writer.close();
//	 for(int i = 0;i<list.length();){
//		 list1 [i]= (char) (list.length()-1);
//	 }
	 int k = 0;
	 for (int i = 0; i < list1.length/2; i++) { 
		
		 
		 char temp = list1[k];
		 list1[k] = list1[list1.length-i-1];
		  list1[list1.length-i-1] = temp;
		  k++; 
 }

  
	 System.out.println(Arrays.toString(list1));
}
}
