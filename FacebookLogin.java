package exceptionHandling;

public class FacebookLogin {
	public static void main(String[]args) throws LoginException {
		String userName=args[0];
		int pswd=Integer.parseInt(args[1]);
		if(userName.equals("John")&& pswd==(123456)) {
			System.out.println("login Success");
			
		}
		else {
			throw new LoginException("login failed");
		}
		
		
	}

}
