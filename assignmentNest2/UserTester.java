package assignmentNest2;

public class UserTester {
	
	public static void main(String[] args) {
		
		User user = new User( 101, "Jack", "jack@infy.com", 1000 );
		
		KYCUser kUser = new KYCUser( 201, "Jill", "jill@infy.com", 3000 );
		
		EPayWallet.processPaymentByUser(user, 700 );
		EPayWallet.processPaymentByUser(kUser, 1500 );
		EPayWallet.processPaymentByUser(kUser, 800 );
		EPayWallet.processPaymentByUser(kUser, 1200 );
		
		
		
		
	}

}
