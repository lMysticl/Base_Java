package lesson06;
import java.util.ArrayList;
public class Task01 {
 @SuppressWarnings("unused")
public static void main(String[] args) {
  //Создание списка 
  ArrayList<Object> objList = new ArrayList<>();
  objList.add(15);
  objList.add(65.25);
  objList.add("Hello");
  objList.add('c');
  
  for (int i = 0; i < objList.size(); i++) {
   Double sum = new Double(0);
   if (objList.get(i) instanceof Double) {
    //sum = sum + (Double) objList.get(0); 
   }
  }
  
  ArrayList<Integer> intList = new ArrayList<>();
  
  intList.add(10);
  intList.add(20);
  intList.add(30);
  intList.add(20);
  
  System.out.println(intList.toString());
  System.out.println("Количество элементов в коллекции : " + intList.size());
  intList.add(1, 100);
  System.out.println(intList.toString());
  int element = intList.set(1, 400);
  System.out.println("Cтарое значение (+1) :" + (++element) );
  System.out.println(intList); 
  element += intList.remove(1);
  System.out.println("Сумма : " + element);
  System.out.println(intList);
  //for-each 
  int summ = 0;
  for (Integer el : intList) {
   summ += el;
  };
  for (int i = 0; i < intList.size(); i++) {
   summ += intList.get(i);
  }
  System.out.println("Проверяем есть ли 20 в коллекции : " + intList.contains(20));
  System.out.println("Под каким индексом элемент 20 :" + intList.indexOf(20));
  System.out.println("Под каким индексом элемент 20 (последний):" + intList.lastIndexOf(20));
  
  ArrayList<Integer> subList = new ArrayList<>();
  subList.add(40); 
  subList.add(50); 
  subList.add(60);
  intList.addAll(intList.size(), subList);
  System.out.println(subList);
  System.out.println(intList);
  ArrayList<Integer> list = new ArrayList<Integer>(); 
  list.add(20);
  list.add(30);
  intList.removeAll(list); // Удаление нескольких элементов
  System.out.println(intList);
 }
}