package assignmentNest2;

public class CrashCourseCertification extends RRTechnicalCertification {
	
//	static {
//		RRTechnicalCertification.setCounter(1002);
//	}
	
//	Constructor
	public CrashCourseCertification( String studentName, String courseName, int admissionTestMarks ) {
		super( studentName, courseName, admissionTestMarks );
		this.generateRegistrationId();
	}
	
//	Methods
	public void generateRegistrationId() {
		if( RRTechnicalCertification.getCounter() % 2 == 0 ) {
			RRTechnicalCertification.setCounter(RRTechnicalCertification.getCounter()+2);
			this.setRegistrationId(RRTechnicalCertification.getCounter());
		} else {
			RRTechnicalCertification.setCounter(RRTechnicalCertification.getCounter()+1);
			this.setRegistrationId(RRTechnicalCertification.getCounter());
		}
	}
	public double calculateFee() {
		double courseFee = RRTechnicalCertification.CRASH_COURSE_FEE;
		if( this.getAdmissionTestMarks() >= 90 ) {
			courseFee = courseFee * ( 1 - (10.0 / 100.0) );
		}
		else if( this.getAdmissionTestMarks() >= 75 && this.getAdmissionTestMarks() <= 89 ) {
			courseFee = courseFee * ( 1 - (5.0 / 100.0) );
		}
		courseFee = courseFee * ( 1 + (12.36/100.0) );
		return courseFee;
	}
	public void displayDetails() {
		System.out.println("Crash Course Registration Details");
		System.out.println("***********************************");
		System.out.println("Student Name     : " + this.getStudentName());
		System.out.println("Course Name     : " + this.getCourseName());
		System.out.println("Course Duration  : 2 months");
		System.out.println("Registration ID  : " + this.getRegistrationId());
		System.out.println("Fees             : " + this.calculateFee());
	}

}
