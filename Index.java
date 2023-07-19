package exceptionHandling;

public class Index {
	public static void main(String[]args) {
		String[] value={"John","Naveen"};
		try {
		    System.out.println(value[4]);
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
		catch(IndexOutOfBoundsException e) {
			System.out.println("Not a Index value ");
		}
		catch(Exception d){
			System.out.println("value not given");
		}
		System.out.println("Thank you");

	}

}
