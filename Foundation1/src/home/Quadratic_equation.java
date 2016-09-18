package home;
import java.util.Scanner;
public class Quadratic_equation {
 public static void main(String[] args) {
  double resX1 = 0, resX2 = 0;
  Scanner scan = new Scanner(System.in);
  System.out.print("");
  int coefA = scan.nextInt();
  System.out.print("");
  int coefB = scan.nextInt();
  System.out.print("");
  int coefC = scan.nextInt();
  if (coefA == 0) {
   System.out.println("Первый коэффициент не может быть 0");
  } else if (coefA < 0 & coefC < 0) {
   System.out.println("Нет действительных решений уравнения");
  } else {
   double disD = Math.pow(coefB, 2) - 4*coefC*coefA;
   if (disD < 0) {
    System.out.println("Нет действительных решений уравнения");
   } else {
    resX1 = ((-coefB + Math.sqrt(disD)) / (2 * coefA));                  
    resX2 = ((-coefB - Math.sqrt(disD)) / (2 * coefA));
if (resX1 == resX2) {
        System.out.println(resX1);
           } else {
       System.out.println(resX1 + " " + resX2);
           }                
   }
  }
  scan.close();
 }
}
//100
//Задание выполнено
//Код решения: 5+MC5XC79lWtOzjSP3iZGMXiVDE=