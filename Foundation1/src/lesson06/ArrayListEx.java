package lesson06;
import java.util.ArrayList;
public class ArrayListEx {
	 public static void main(String[] args) {
	  ArrayList<Object> list = new ArrayList<>();
	  
	  for (int i = 0; i < 3; i++) {
	   list.add(i);
	  }
	  
	  list.add('c');
	  list.add("Hello");
	  
	  double PI = Math.PI;
	  for (int i = 0; i < 3; i++) {
	   list.add(PI * i);
	  }
	  
	  System.out.println(list);
	  
	  for (Object obj : list) {
	   if (obj instanceof Integer) {
	    System.out.println((Integer) obj * 2);
	   }
	   if (obj instanceof String) {
	    System.out.println((String) obj + " user!!!");
	   }
	   if (obj instanceof Double) {
	    System.out.println((Double) obj * 2);
	   }
	  }
	 }
	}

