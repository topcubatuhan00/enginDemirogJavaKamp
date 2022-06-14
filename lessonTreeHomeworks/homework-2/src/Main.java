
public class Main {
	
	public static void main(String[] args) {
		
		Student student = new Student();
		student.id = 1;
		student.name = "Batuhan";
		student.email = "abc@abc.com";
		student.lastName = "Topcu";
		student.courseName = "JAVA";
		
		
		Instructor instructor = new Instructor();
		instructor.id = 1;
		instructor.name = "Engin";
		instructor.lastName = "Demirog";
		instructor.email = "abc@abc.com";
		instructor.teacherCertificate = "Python";
		
		
		StudentManager studentManager = new StudentManager(student);
		InstructorManager instructorManager = new InstructorManager();
		
		studentManager.registerInCourse();
		instructorManager.addCourse(instructor);
		studentManager.deleteInCourse();
	}
	
}
