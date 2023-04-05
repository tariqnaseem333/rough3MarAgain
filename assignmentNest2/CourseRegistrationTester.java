package assignmentNest2;

public class CourseRegistrationTester {

	public static void main(String[] args) {
		
		CourseRegistration course1 = new CourseRegistration();
		course1.setStudentName("Peter");
		course1.setRegistrationId(5001);
		course1.setQualifyingMarks(58);
		course1.setCourseId(1005);
		course1.setHostelRequired(true);
		
		if( course1.validateMarks() ) {
			System.out.println("Marks are greater or equal to 65. You are eligible for Admission");
		} else {
			System.out.println("Marks are less than 65. You are not eligible for Admission");
		}
		
		CourseRegistration course2 = new CourseRegistration();
		course2.setStudentName("Peter");
		course2.setRegistrationId(5001);
		course2.setQualifyingMarks(58);
		course2.setCourseId(1006);
		course2.setHostelRequired(true);
		
		if( course2.validateCourseId() ) {
			System.out.println("The course Id is valid.");
		} else {
			System.out.println("Invalid Course Id. Please try again");
		}
		
		CourseRegistration course3 = new CourseRegistration();
		course3.setStudentName("Peter");
		course3.setRegistrationId(5001);
		course3.setQualifyingMarks(78);
		course3.setCourseId(1005);
		course3.setHostelRequired(false);
		
		course3.displayDetails();	

	}

}
