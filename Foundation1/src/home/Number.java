package home;

import java.util.Scanner;

public class Number {
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Ведите семи значное число: =");
	int num = scan.nextInt();
		
	int numFs,numS,numS1,numTh,numTh1,numFr,numFr1,numFf,numFf1,numSx,numSx1,numSv,sumN;
	numFs=(int)Math.floor(num/1000000);//первая цифра
		
	numS1=(int)Math.floor(num/100000);
			numS=numS1-numFs*10;//вторая цифра
			
			numTh1=(int)Math.floor(num/10000);
				numTh=numTh1-(numFs*10+numS)*10;//третья цифра
				
				numFr1=(int)Math.floor(num/1000);
			    	numFr=numFr1-((numFs*10+numS)*10+numTh)*10;//четвертая цифра

			    	numFf1=(int)Math.floor(num/100);
			    	numFf=numFf1-(((numFs*10+numS)*10+numTh)*10+numFr)*10;//пятая цифра
					
			    			numSx1=(int)Math.floor(num/10);
							numSx=numSx1-((((numFs*10+numS)*10+numTh)*10+numFr)*10+numFf)*10;//шестая цифра
							
							numSv=num-(((((numFs*10+numS)*10+numTh)*10+numFr)*10+numFf)*10+numSx)*10;//седьмая цифра
			
		sumN=(numFs+numS+numTh+numFr+numFf+numSx+numSv)/7;
		
		System.out.println(""+ sumN );
	scan.close();	
	}
}
