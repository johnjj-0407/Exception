package exceptionHandling;

public class Name {
	@SuppressWarnings("null")
	public static void main(String[]args) {
		System.out.println("welcome");
		String name=null;
		try {
		System.out.println(name.toUpperCase());
		}
		catch(ArithmeticException a){
			System.out.println("not given");
		}
		catch(NullPointerException e) {
			System.out.println("give the name");
			//e.printStackTrace();
		}
		catch(NumberFormatException a) {
			System.out.println("not a value");
		}
		catch(Exception a){
			System.out.println("value not given");
		}
		System.out.println("Thank you");
		String x="Hello";
		System.out.println(x.indexOf('O'));
	@SuppressWarnings("unused")
	String y="Hai";
	System.out.println(x.indexOf('a'));
	}

}
