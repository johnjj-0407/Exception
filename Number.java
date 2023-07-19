package exceptionHandling;

public class Number {
	public static void main(String[]args) {
		System.out.println("Welcome");
		String value="TN 01 d 2204";
		try {
			int a=Integer.parseInt(value);
		    System.out.println(a);
		}
		catch(ArithmeticException b){
			System.out.println("not given");
		}
		catch(NullPointerException e) {
			System.out.println("give the value");
			//e.printStackTrace();
		}
		catch(NumberFormatException c) {
			System.out.println("not a correct value");
		}
		catch(Exception d){
			System.out.println("value not given");
		}
		System.out.println("Thank you");
		
	}

}
