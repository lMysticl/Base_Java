package home;

public class MainVahtersha {
	public static void main(String[] args) {
		Vahtersha Owners = new Vahtersha(20,20); 
//		Vahtersha Friends = new Vahtersha(20);
		Owners.removeOwners(6);
		Owners.printInfo() ;
		Owners.removeFriends(5);
		Owners.printInfo() ;
	
	}



}

