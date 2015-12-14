
public class Task14Arrays {

	public static void main(String[] args) {	
//		Имате предварително въведен едномерен масив, съдържащ реални
//		числа.
//		Да се състави програма, чрез която се избират само елементи със
//		стойности от интервала [-2.99..2.99] и новата редица се извежда на
//		екрана.

		double [] array = {7.1,8.5,0.2,3.7,0.99,1.4,-3.5,-110,212,341,1.2};

		for(int index= 0; index < array.length; index++){
			if((array[index]>=-2.99 && array[index]<=2.99 )){
				System.out.print(array[index] + " ");
			}
		}
		
		
	}

}
