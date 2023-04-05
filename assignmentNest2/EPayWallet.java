package assignmentNest2;

public class EPayWallet {
	
	public static void processPaymentByUser( User user, double billAmount ) {
		boolean isSuccessful = user.makePayment(billAmount);
		if( isSuccessful ) {
			System.out.println("Congratulations " + user.getUserName() + ", payment of "
					+ billAmount + " was successful");
		} else {
			System.out.println("Sorry Jill, not enough balance to make payment");
		}
		
		System.out.println("Your wallet balance is " + user.getWalletBalance());
		if( user instanceof KYCUser ) {
			System.out.println("You have " + ((KYCUser) user).getRewardPoints() + " reward points");
		}
		System.out.println("--------------------------------------------------------");

	}

}
