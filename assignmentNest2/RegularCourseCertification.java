package assignmentNest2;

public class RegularCourseCertification extends RRTechnicalCertification {
	
//	Instance Variables
	private int courseDuration;
	
//	static {
//		RRTechnicalCertification.setCounter(1001);
//	}
	
//	Constructor
	public RegularCourseCertification( String studentName, String courseName, int admissionTestMarks,
			int courseDuration ) {
		super( studentName, courseName, admissionTestMarks );
		this.courseDuration = courseDuration;
		this.generateRegistrationId();
	}
	
//	Methods
	public void generateRegistrationId() {
		if( RRTechnicalCertification.getCounter() % 2 == 0 ) {
			RRTechnicalCertification.setCounter(RRTechnicalCertification.getCounter()+1);
			this.setRegistrationId(RRTechnicalCertification.getCounter());
		} else {
			RRTechnicalCertification.setCounter(RRTechnicalCertification.getCounter()+2);
			this.setRegistrationId(RRTechnicalCertification.getCounter());
		}
	}
	public double calculateFee() {
		double courseFee = RRTechnicalCertification.REGULAR_COURSE_FEE * this.getCourseDuration();
		if( this.getAdmissionTestMarks() >= 90 ) {
			courseFee = courseFee * ( 1 - (10.0 / 100.0) );
		}
		else if( this.getAdmissionTestMarks() >= 75 && this.getAdmissionTestMarks() <= 89 ) {
			courseFee = courseFee * ( 1 - (5.0 / 100.0) );
		}
		return courseFee;
	}
	public void displayDetails() {
		System.out.println("Regular Course Registration Details");
		System.out.println("***********************************");
		System.out.println("Student Name     : " + this.getStudentName());
		System.out.println("Course Name     : " + this.getCourseName());
		System.out.println("Course Duration  : " + this.getCourseDuration() + " months");
		System.out.println("Registration ID  : " + this.getRegistrationId());
		System.out.println("Fees             : " + this.calculateFee());
	}

//	Getters and Setters
	public int getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}
	
	
	
	
}
