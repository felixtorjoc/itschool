 class Operators{
	public static void main(String[] args){
		int result1 = add(1,2);
		System.out.println(result1);

		int result2 = subtract(35,25);
		System.out.println(result2);

		int result3 = multiplicate(2,3);
		System.out.println(result3);

		int result4 = divide(7,3);
		System.out.println(result4);

		int result5 = restul(9,5);
		System.out.println(result5);

		String result6 = funct(33,5);
		System.out.println(result6);


	
	}

	public static int add(int termen1, int termen2){
		return termen1 + termen2;
	}

	public static int subtract(int termen1, int termen2){
		return termen1 - termen2;
	}

	public static int multiplicate(int termen1, int termen2){
		return termen1 * termen2;
	}

	public static int divide(int termen1, int termen2){
		return termen1 / termen2;
	}

	public static int restul(int termen1, int termen2){
		return termen1 % termen2;
	}

	public static String funct(int termen1,int termen2){
		return divide(termen1,termen2) + "*" + termen2 + "+" + restul(termen1,termen2);




	}


}