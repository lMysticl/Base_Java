package home3;

public class TypeEr {
	public static void main(String[] args) {
		int a = 50001;
		int count = 0, d = 0,b=0;
		int array[] = new int[50001];
		for (int i = 0; i < a; i++) {
			array[count] = (int) (count++);
	/*		if (count % 2 == 1 | count  % 20 == 1 | count % 200 == 1 | count % 2000 == 1 | count  % 20000 == 1) {
				d++;*/
			String s=String.valueOf(i);
			if(s.indexOf('2')!=-1){
	                b++;
	            }
		
			}
		for (int i = array[0]; i < array[array.length-1]; i++){
			String s=String.valueOf(array[i]);
		if(s.indexOf('2')!=-1){
                d++;}
		
		 } System.out.println("Всего бракованных табличек - "+b);
		System.out.println(d);
//		System.out.println(Arrays.toString(array));
//		System.out.println(d);
//		
//		Tabls();
	}


    public static int Tabls(){
        //Создадим переменную, в которую будем заносить количество бракованных табличек
        int b=0;
        //С помощью простого цикла переберем все номера табличек
        for(int i=2;i<=50000;i++){
            //Для того, чтобы найти табличку с цифрой 2 преобразуем номер таблички в String. При помощи метода indexOf проверим наличие в строке символа 2 и если такой символ присутствует - увеличиваем счетчик на единицу
            String s=String.valueOf(i);
            if(s.indexOf('2')!=-1){
                b++;
            }
        }
        System.out.println("Всего бракованных табличек - "+b);
        return b;
    }
}
