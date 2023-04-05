package assignmentNest2;

public class RRTechnicalCertificationTester {

	public static void main(String[] args) {
		
		RegularCourseCertification r1 = new RegularCourseCertification( "Rakesh", "J2EE", 85, 5 );
		r1.displayDetails();
		
		CrashCourseCertification c1 = new CrashCourseCertification( "Roshan", "Angular", 71 );
		c1.displayDetails();

	}

}
