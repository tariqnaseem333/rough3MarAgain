package assignmentNest2;

public class KYCUser extends User {
	
//	Instance Variable
	private int rewardPoints;
	
//	Constructor
	public KYCUser( int id, String userName, String email, double walletBalance ) {
		super( id, userName, email, walletBalance );
	}
	
//	Methods
	@Override
	public boolean makePayment(  double billAmount ) {
		boolean isSuccessful = super.makePayment(billAmount);
		if( isSuccessful ) {
			this.setRewardPoints( getRewardPoints() + (int)((billAmount*10.0) / 100.0) );
		}
		return isSuccessful;
	}
	
//	Getters and Setters
	public int getRewardPoints() {
		return rewardPoints;
	}
	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}

}
