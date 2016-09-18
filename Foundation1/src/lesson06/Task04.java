package lesson06;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
public class Task04 {
 @SuppressWarnings({ "resource", "unchecked" })
public static void main(String[] args) 
   throws FileNotFoundException, IOException, ClassNotFoundException {
  ArrayList<Integer> numbers = new ArrayList<>();
  numbers.add(10);
  numbers.add(20);
  numbers.add(30);
  
  ObjectOutputStream out 
  = new ObjectOutputStream(new FileOutputStream("test.txt"));
  out.writeObject(numbers);
  out.flush();
  out.close();
  
  ObjectInputStream input 
  = new ObjectInputStream(new FileInputStream("test.txt"));
  ArrayList<Integer> fromFile = 
    (ArrayList<Integer>) input.readObject();
  System.out.println(fromFile);
 }
}