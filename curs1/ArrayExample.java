public class ArrayExample{
	public static void main(String args[]){

		int[] myArray = new int[3];
		
		myArray[0]= 10;
		myArray[1]=20;
		myArray[2]=30;
		System.out.println(myArray[0]);
		System.out.println(myArray[1]);
		System.out.println(myArray[2]);
		System.out.println(myArray.length);


		int[] yourArray = new int[]{1,2,3};
		
		System.out.println(yourArray[0]);
		System.out.println(yourArray[1]);
		System.out.println(yourArray[2]);

		myArray[2]=30000;
		
		System.out.println(myArray[2]);






	
	}
}