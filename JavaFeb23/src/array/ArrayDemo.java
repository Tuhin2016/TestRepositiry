package array;

public class ArrayDemo {

	public static void main(String[] args) {
		// this is an dymentional array
		
		//declaring array
		String [] myArray = new String[3];
		//assigning value to the array
		myArray[0] = "Selenium";
		myArray[1] = "Eclipse";
		myArray[2] = "Java";
		
		System.out.println(myArray[1]);
		
		for (int i=0; i<myArray.length; i++) {
			System.out.println(myArray[1]);
		}
		//another way to declaring the array
		int [] number = {4,2,7};
		for (int i = 0; i<number.length; i++) {
			System.out.println(number [1]);
		}
		System.out.println("Example of enhanced for loop");
		//example of enhanced for loop
		for (int v: number) {
			System.out.println(v);
		}
		
		

	}

}
