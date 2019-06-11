public class Objects{
	public static void main(String[] args){
		String message = saySomething("Something");
		System.out.println(message);
	}

	public static String saySomething(String msg){
		msg += " else";
		return msg;
	}

}
