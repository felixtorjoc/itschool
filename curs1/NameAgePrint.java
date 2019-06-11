public class NameAgePrint{
	public static void main(String args[]){
		
		String result = agePrinter("Ilie", 8);
		System.out.println(result);

		String[] names = new String[]{"John", "Mary", "Billy"};
		int[] age = new int[]{10, 12, 14};
		String[] results = new String[names.length];

		for (int i = 0; i<names.length; i++) {
			results[i] = agePrinter(names[i], age[i]);
			System.out.println(results[i]);
		} 
		
		}
		
		public static String agePrinter(String name, int age){
			return name + " is " + age + " years old";
		}


}