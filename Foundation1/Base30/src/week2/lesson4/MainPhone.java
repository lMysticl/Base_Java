package week2.lesson4;

public class MainPhone {
	public static void main(String[] args) {
				
			  Phone phone1 = new Phone("1","Nokia");
			  Phone phone2 = new Phone("2","Samsung");
			  Phone phone3 = new Phone("3","IPhone");
			  Phone phone4 = new Phone("4","Nexia");
			  
			  Phone.printAllNumbers();
			  
			  Phone ph1 = Phone.getRandomPhone();
			  Phone ph2 = Phone.getRandomPhone();
			  ph1.call(ph2.getMyNumber());
			  
	//		  System.out.println("find 2:"+Phone.isNumberExist("2"));
	//		  System.out.println("find 10:"+Phone.isNumberExist("10"));  
			  
			 }
			}
	

