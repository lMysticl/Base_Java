package home;

public class Vahtersha {
	int Owners;
	int Friends;
	boolean stop= false;
//	double weigthVegetables;

	public void printInfo() {	
		System.out.println(Owners);
		System.out.println(Friends);
	}
	public  Vahtersha(){
		
	}
//	public  Vahtersha(int Owners){
//		this.Owners= Owners;
//		
//	}
	public  Vahtersha(int Friends,int Owners){
		this.Friends= Friends;
		this.Owners = Owners;
	}
	
	public int Friends(){
		return Friends;
	}
	public int getOwners(){
		return Owners;
	}


	public  void removeOwners(int x) 
	{
		 this.Owners += x;		

	}
	
	public void  removeFriends(int y){
		 this.Friends += y;
	
	}
	
	public void start() {
		stop = true;
	}

}

