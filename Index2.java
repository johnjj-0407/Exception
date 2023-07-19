package exceptionHandling;

public class Index2 {
	public static void main(String[]args) {
	String value="John";
	try {
	    System.out.println(value.charAt(4));
	}
	catch(ArithmeticException b){
		System.out.println("not given");
	}
	catch(NullPointerException e) {
		System.out.println("give the value");
		
	}
	catch(NumberFormatException c) {
		System.out.println("not a correct value");
	}
	catch(IndexOutOfBoundsException e) {
		System.out.println("Not a Index Position ");
		e.printStackTrace();
	 }
	catch(Exception d){
		System.out.println("value not given");
	}
	finally {
		System.out.println("value not available");
	}
	System.out.println("Thank you");
	}


}
