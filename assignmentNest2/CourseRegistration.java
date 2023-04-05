package assignmentNest2;

public class CourseRegistration {
	
//	Instance Variables
	private String studentName;
	private int registrationId;
	private float qualifyingMarks;
	private double courseFee;
	private int courseId;
	private boolean hostelRequired;

//	Methods
	public boolean validateMarks() {
		if( this.getQualifyingMarks() >= 65 && this.getQualifyingMarks() <= 100 ) {
			return true;
		} else {
			return false;
		}
	}
	public boolean validateCourseId() {
		if( this.getCourseId() >= 1001 && this.getCourseId() <= 1005 ) {
			return true;
		} else {
			return false;
		}
	}
	public void calculateCourseFee() {
		double baseFare = 0;
		switch( this.getCourseId() ) {
		case 1001 : baseFare = 55_000;
		break;
		case 1002 : baseFare = 35_675;
		break;
		case 1003 : baseFare = 28_300;
		break;
		case 1004 : baseFare = 22_350;
		break;
		case 1005 : baseFare = 1_15_000;
		break;
		default : baseFare = 0;
		break;
		}
		if( this.getQualifyingMarks() >= 65 && this.getQualifyingMarks() <= 69 ) {
			this.courseFee = baseFare * ( 1 - 5.0 / 100.0 );
		}
		else if( this.getQualifyingMarks() >= 70 && this.getQualifyingMarks() <= 84 ) {
			this.courseFee = baseFare * ( 1 - 10.0 / 100.0 );
		}
		else if( this.getQualifyingMarks() >= 85 ) {
			this.courseFee = baseFare * ( 1 - 15.0 / 100.0 );
		}
	}
	public void displayDetails() {
		System.out.println("********Course Allocation Details*********");
		System.out.println("Student Name: " + this.getStudentName());
		System.out.println("Course Id: " + this.getCourseId());
		System.out.println("Qualifying Exam Marks: " + this.getQualifyingMarks());
		System.out.println("Student's Registration Id: " + this.getRegistrationId());
		this.calculateCourseFee();
		System.out.println("Total Course Fee: " + this.getCourseFee());
		System.out.println("Hostel Required: " + this.isHostelRequired());
	}
	

//	Getters and Setters
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}
	public float getQualifyingMarks() {
		return qualifyingMarks;
	}
	public void setQualifyingMarks(float qualifyingMarks) {
		this.qualifyingMarks = qualifyingMarks;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public boolean isHostelRequired() {
		return hostelRequired;
	}
	public double getCourseFee() {
		return courseFee;
	}
	public void setHostelRequired(boolean hostelRequired) {
		this.hostelRequired = hostelRequired;
	}

}
