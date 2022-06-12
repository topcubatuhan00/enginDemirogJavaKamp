package lessonTwoHomeworks;

public class CourseManager {
	public void registerCourse(Course course, User user) {
		System.out.println(user.name +" "+user.surname+" added in " + course.name);
	}
	
	public void seeCourseDeatils(Course course) {
		System.out.println("Course Name : "+course.name);
		System.out.println("Course Description : "+course.description);
	}
}
